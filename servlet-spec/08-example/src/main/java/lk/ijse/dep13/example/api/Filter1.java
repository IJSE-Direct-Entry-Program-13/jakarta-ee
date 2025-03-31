package lk.ijse.dep13.example.api;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Filter1 extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        res.getWriter().println("<h1>I am from the Filter1: Incoming</h1>");
        //res.getWriter().flush();
        chain.doFilter(req, res);
        res.getWriter().println("<h1>I am from the Filter1: Outgoing</h1>");
    }
}
