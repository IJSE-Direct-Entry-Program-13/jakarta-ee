package lk.ijse.dep13.requestresponselifecycle.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class C extends HttpFilter {
    static{
        System.out.println("C Filter class is being initialized");
    }
    public C() {
        System.out.println("C Filter object is being initialized");
    }
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("C: init(f.config)");
        super.init(config);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("C: init");
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("C: doFilter(s.req, s.res, f.chain)");
        super.doFilter(req, res, chain);
    }
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("C: doFilter(http.s.req, http.s.res, f.chain)");
        System.out.println("C: Incoming");
        super.doFilter(req, res, chain);
        System.out.println("C: Outgoing");
    }
}
