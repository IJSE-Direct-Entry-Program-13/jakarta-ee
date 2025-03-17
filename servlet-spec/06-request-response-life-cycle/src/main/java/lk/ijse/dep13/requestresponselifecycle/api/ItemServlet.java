package lk.ijse.dep13.requestresponselifecycle.api;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "item-servlet", urlPatterns = "/items")
public class ItemServlet extends HttpServlet {
    static {
        System.out.println("ItemServlet class is being initialized");
    }
    public ItemServlet() {
        System.out.println("ItemServlet object is being initialized");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("ItemServlet: init(s.config)");
        super.init(config);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("ItemServlet: init");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ItemServlet: doGet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ItemServlet: doPost");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ItemServlet: service(http.s.req, http.s.res)");
        super.service(req, resp);
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("ItemServlet: service(s.req, s.res)");
        super.service(req, res);
    }
}
