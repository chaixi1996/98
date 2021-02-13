package cn.ajax.service;

import cn.ajax.dao.UserDao;
import cn.ajax.pojo.User;

import java.sql.SQLException;

/**
 * @ProjectName: ajax
 * @Package: cn.ajax.service
 * @ClassName: Userservice
 * @Author: ChaiXi
 * @Description:
 * @Date: 2021/1/16 12:28
 * @Version: 1.0
 */
public class Userservice {

    public static User findByname(String username) throws SQLException {
        UserDao userDao = new UserDao();
        User user = userDao.findUser(username);
        return user;
    }
}
