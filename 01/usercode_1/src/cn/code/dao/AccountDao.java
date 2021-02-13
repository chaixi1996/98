package cn.code.dao;

import cn.code.pojo.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ProjectName: cookiceandsession
 * @Package: cn.code.dao
 * @ClassName: AccountDao
 * @Author: cx
 * @Description:
 * @Date: 2021/1/8 22:57
 * @Version: 1.0
 */
public class AccountDao {
    private QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    public void updateAccount(String name,Double money) throws SQLException {
        Connection connection = DruidUtil.getconnection();
        String sql = "update account set money=money+? where name = ?";
        queryRunner.update(connection,sql,money, name);

    }
}
