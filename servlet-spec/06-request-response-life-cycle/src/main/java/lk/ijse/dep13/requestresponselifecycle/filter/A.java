package lk.ijse.dep13.requestresponselifecycle.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class A extends HttpFilter {
    static{
        System.out.println("A Filter class is being initialized");
    }
    public A() {
        System.out.println("A Filter object is being initialized");
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("A: init(f.config)");
        super.init(config);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("A: init");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("A: doFilter(s.req, s.res, f.chain)");
        super.doFilter(req, res, chain);
    }
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("A: doFilter(http.s.req, http.s.res, f.chain)");
        super.doFilter(req, res, chain);
    }
}
