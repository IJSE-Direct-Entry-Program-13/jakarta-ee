package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 1, urlPatterns = "/hello3")
public class HelloServlet3 extends HttpServlet {
    static{
        System.out.println("HelloServlet3 class is being initialized");
    }

    public HelloServlet3() {
        System.out.println("HelloServlet3 instance is being initialized");
    }
}
