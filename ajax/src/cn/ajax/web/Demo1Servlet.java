package cn.ajax.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: ajax
 * @Package: ${PACKAGE_NAME}
 * @ClassName: ${NAME}
 * @Author: cx
 * @Description: ${description}
 * @Date: 2021/1/15 23:11
 * @Version: 1.0
 */
@WebServlet("/demo1")
public class Demo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("获得的用户名为" + username);
        response.getWriter().write("hello word");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
