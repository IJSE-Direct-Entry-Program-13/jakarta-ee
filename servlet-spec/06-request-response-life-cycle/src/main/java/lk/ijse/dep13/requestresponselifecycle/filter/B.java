package lk.ijse.dep13.requestresponselifecycle.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class B extends HttpFilter {
    static{
        System.out.println("B Filter class is being initialized");
    }
    public B() {
        System.out.println("B Filter object is being initialized");
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("B: init(f.config)");
        super.init(config);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("B: init");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("B: doFilter(s.req, s.res, f.chain)");
        super.doFilter(req, res, chain);
    }
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("B: doFilter(http.s.req, http.s.res, f.chain)");
        System.out.println("B: Incoming");
        chain.doFilter(req, res);
        System.out.println("B: Outgoing");
    }
}
