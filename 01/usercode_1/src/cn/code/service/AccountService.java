package cn.code.service;

import cn.code.dao.AccountDao;
import cn.code.pojo.DruidUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ProjectName: cookiceandsession
 * @Package: cn.code.service
 * @ClassName: AccountService
 * @Author: cx
 * @Description:
 * @Date: 2021/1/8 22:56
 * @Version: 1.0
 */
public class AccountService {
    private AccountDao accountDao = new AccountDao();

    public void transfer(Double money, String to, String from) {
        Connection conn = null;
        try {
            conn = DruidUtil.getconnection();
            conn.setAutoCommit(false);
            accountDao.updateAccount(from, -money);
            int num = 10 / 0;
            accountDao.updateAccount(to, money);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                assert conn != null;
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("转账超时！！！");
        }
    }
}
