package cn.ajax.web;

import cn.ajax.entry.Result;
import cn.ajax.pojo.User;
import cn.ajax.service.Userservice;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

/**
 * @ProjectName: ajax
 * @Package: ${PACKAGE_NAME}
 * @ClassName: ${NAME}
 * @Author: ChaiXi
 * @Description: ${description}
 * @Date: 2021/1/16 12:28
 * @Version: 1.0
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            Class clazz = this.getClass();
            Method acrion = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            acrion.invoke(this,request,response);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private void findname(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result(true);
        try {
            String username = request.getParameter("username");
            User user = Userservice.findByname(username);
            if (user != null) {
                result.setuser(false);
            }else {
                result.setuser(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result.setFlag(false);
            result.setErrEnging("服务器错误");
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(result);
            response.getWriter().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
