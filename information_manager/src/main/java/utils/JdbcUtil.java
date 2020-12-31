package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
<<<<<<< .merge_file_a15072
 * @ClassName JdbcUtil
 * @Description  JDBC连接工具类，使用了单例模式，封装了连接和关闭方法
 * @Author MECHREVO
 * @Date 2020/11/15
 **/
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/crm_manager?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static Connection connection = null;
    private static JdbcUtil jdbcUtil = null;


}

