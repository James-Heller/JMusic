package edu.JamesTang.JMusic.filter;


import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter{

    public EncodingFilter(){
        System.out.println("Filter Constructed!");
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Initialized!");
    }
}
