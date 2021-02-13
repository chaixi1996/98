package cn.ajax.dao;

import cn.ajax.UTILS.DruidUtil;
import cn.ajax.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @ProjectName: ajax
 * @Package: cn.ajax.dao
 * @ClassName: UserDao
 * @Author: ChaiXi
 * @Description:
 * @Date: 2021/1/16 12:57
 * @Version: 1.0
 */
public class UserDao {
    private  QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    public User findUser(String username) throws SQLException {
        String sql = "select * from linkman where name = ?";
        return queryRunner.query(sql,new BeanHandler<>(User.class),username);

    }
}
