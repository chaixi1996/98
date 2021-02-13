package cn.code.web;

import cn.code.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: cookiceandsession
 * @Package: ${PACKAGE_NAME}
 * @ClassName: ${NAME}
 * @Author: cx
 * @Description: ${description}
 * @Date: 2021/1/8 21:20
 * @Version: 1.0
 */
@WebServlet("/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        Double money = Double.valueOf(request.getParameter("money"));
		system.out.println("adminam带");

        AccountService accountService = new AccountService();
        try {
            accountService.transfer(money,to,from);
            response.getWriter().write("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("转账失败了");
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
