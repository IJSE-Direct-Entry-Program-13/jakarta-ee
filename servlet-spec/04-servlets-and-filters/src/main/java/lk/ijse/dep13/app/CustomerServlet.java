package lk.ijse.dep13.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "customer-servlet",
        urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {

    static {
        System.out.println("CustomerServlet class object is being initialized");
    }

    public CustomerServlet() {
        System.out.println("CustomerServlet instance is being initialized");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init(ServletConfig)");
        System.out.println("Before: " + getServletConfig());
        super.init(config);
        System.out.println("After: " + getServletConfig());
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
