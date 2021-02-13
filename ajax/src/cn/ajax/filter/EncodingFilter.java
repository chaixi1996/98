package cn.ajax.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: ajax
 * @Package: cn.ajax.filter
 * @ClassName: EncodingFilter
 * @Author: cx
 * @Description:
 * @Date: 2021/1/15 23:15
 * @Version: 1.0
 */
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /**
         * 统一设置请求的编码方式为UTF-8
         */
        servletRequest.setCharacterEncoding("UTF-8");
        /**
         * 统一设置响应的编码方式
         */
        servletResponse.setContentType("text/html;charset=UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
