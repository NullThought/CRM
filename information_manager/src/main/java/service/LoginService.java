package service;

import utils.ResultEntity;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
public interface LoginService {
    ResultEntity Login(String account, String passsword);
}
