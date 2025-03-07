package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "customer-servlet",
        urlPatterns = "/customers", loadOnStartup = 0)
public class CustomerServlet extends HttpServlet {

    static {
        System.out.println("CustomerServlet class object is being initialized");
    }

    public CustomerServlet() {
        System.out.println("CustomerServlet instance is being initialized");
    }

}
