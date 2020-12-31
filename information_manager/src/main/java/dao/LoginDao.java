package dao;

import entity.Logins;

import java.sql.SQLException;

/**
 * @ClassName LoginDao
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
public interface LoginDao {
    Logins findLoginByAccount(String account)throws SQLException;
}
