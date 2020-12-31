package dao.impl;

import dao.LoginDao;
import entity.Logins;
import utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName LoginDaolmpl
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
public class LoginDaolmpl implements LoginDao {

    @Override
    public Logins findLoginByAccount(String account) throws SQLException {
        JdbcUtil jdbcUtil=JdbcUtil.getInitJdbcUtil();
        Connection connection=jdbcUtil.getConnection();
        String sql="SELECT*FROM manager WHERE account=?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,account);
        ResultSet rs=pstmt.executeQuery();
        Logins logins =null;
        while (rs.next()) {
            int id = rs.getInt("id");
            String adminAccount=rs.getString("account");
            String password=rs.getString("password");
            String adminName= rs.getString("admin_name");
            logins = new Logins();
            logins.setId(id);
            logins.setAccount(adminAccount);
            logins.setPassword(password);
            logins.setAdminName(adminName);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return logins;
    }
}