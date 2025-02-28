package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 3, urlPatterns = "/hello4")
public class HelloServlet4 extends HttpServlet {
    static{
        System.out.println("HelloServlet4 class is being initialized");
    }

    public HelloServlet4() {
        System.out.println("HelloServlet4 instance is being initialized");
    }
}
