package cn.ajax.web;

import com.fasterxml.jackson.databind.ObjectMapper;

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
 * @Author: ChaiXi
 * @Description: ${description}
 * @Date: 2021/1/16 12:21
 * @Version: 1.0
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ObjectMapper obj = new ObjectMapper();
        String s = obj.writeValueAsString("");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
