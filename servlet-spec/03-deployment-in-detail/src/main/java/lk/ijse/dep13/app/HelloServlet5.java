package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 2, urlPatterns = "/hello5")
public class HelloServlet5 extends HttpServlet {
    static {
        System.out.println("HelloServlet5 class is being initialized");
    }

    public HelloServlet5() {
        System.out.println("HelloServlet5 instance is being initialized");
    }
}
