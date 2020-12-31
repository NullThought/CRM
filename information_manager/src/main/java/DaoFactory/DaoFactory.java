package DaoFactory;

import dao.LoginDao;
import dao.impl.LoginDaolmpl;
import frame.Login;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author MECHREVO
 * @Date 2020/12/31
 */
public class DaoFactory {
    public static LoginDao getLoginDaoInstance() {
        return new LoginDaolmpl();
    }
}
