package org.scoula.ex03.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(urlPatterns={"/*"})
public class PerformanceFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        FilterChain filterChain;
        ServletRequest servletRequest;
        filterChain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();

        System.out.println(servletRequest.get + "실행 시간"+(end-start));

        HttpServletRequest Request = (HttpServletRequest) servletRequest;
        System.out.println(
                request.getMethod() + ":" +
                request.getRequestURI()+ "실행 시간:" + (end - start));

    }



}
