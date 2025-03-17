package lk.ijse.dep13.mappingspec;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "hello-servlet-4", urlPatterns = "/sup*")
public class HelloServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Exact Mapping</h1>");
        out.println("<h2>Servlet Path:" + req.getServletPath() +"</h2>");
        out.println("<h2>Path Info:" + req.getPathInfo() +"</h2>");
        out.println("<h2>Request URL:" + req.getRequestURL() +"</h2>");
        out.println("<h2>Request URI:" + req.getRequestURI() +"</h2>");
    }
}
