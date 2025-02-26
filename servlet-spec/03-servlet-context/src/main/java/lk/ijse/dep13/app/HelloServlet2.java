package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/hello2")
public class HelloServlet2 extends HttpServlet {
    static{
        System.out.println("HelloServlet2 class is being initialized");
    }

    public HelloServlet2() {
        System.out.println("HelloServlet2 instance is being initialized");
    }
}
