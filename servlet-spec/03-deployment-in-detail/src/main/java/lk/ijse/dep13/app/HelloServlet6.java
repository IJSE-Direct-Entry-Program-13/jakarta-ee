package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 0,urlPatterns = "/hello6")
public class HelloServlet6 extends HttpServlet {
    static {
        System.out.println("HelloServlet6 class is being initialized");
    }

    public HelloServlet6() {
        System.out.println("HelloServlet6 instance is being initialized");
    }
}
