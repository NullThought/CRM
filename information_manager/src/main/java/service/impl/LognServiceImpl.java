package service.impl;

import DaoFactory.DaoFactory;
import dao.LoginDao;
import entity.Logins;
import frame.Login;
import org.apache.commons.codec.digest.DigestUtils;
import service.LoginService;
import utils.ResultEntity;

import java.sql.SQLException;

/**
 * @ClassName LognServiceImpl
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
public class LognServiceImpl implements LoginService {
    private final LoginDao loginDao=DaoFactory.getLoginDaoInstance();
    @Override
    public ResultEntity Login(String account, String passsword) {
        ResultEntity resultEntity;
       Logins login=null;
        try {
            //根据账号找管理员信息,捕获SQL异常
            login = loginDao.findLoginByAccount(account);
        } catch (SQLException e) {
            System.err.println("根据账号查找管理员信息出现SQL异常");
        }
        //根据账号查找到了记录
        if(login!=null){
            //比较密码,此时需要将客户端传过来的的密码进行MD5加密后才能比对
            if (DigestUtils.md5Hex(passsword).equals(login.getPassword())) {
                resultEntity=ResultEntity.builder().code(0).message("登陆成功").data(login).build();
            }else {//账号存在,密码输入错误
                resultEntity=ResultEntity.builder().code(1).message("密码错误").build();
            }
        }else {//账号不存在
            resultEntity=ResultEntity.builder().code(2).message("账号不存在").build();
        }

        return resultEntity;
    }
}