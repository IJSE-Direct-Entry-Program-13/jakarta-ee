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
@WebServlet(name = "customer-servlet", urlPatterns = "/customers", loadOnStartup = 0)
public class CustomerServlet extends HttpServlet {
    static {
        System.out.println("CustomerServlet class is being initialized");
    }
    public CustomerServlet() {
        System.out.println("CustomerServlet object is being initialized");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("CustomerServlet: init(s.config)");
        super.init(config);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("CustomerServlet: init");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doGet");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: doPost");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CustomerServlet: service(http.s.req, http.s.res)");
        super.service(req, resp);
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("CustomerServlet: service(s.req, s.res)");
        super.service(req, res);
    }
}
