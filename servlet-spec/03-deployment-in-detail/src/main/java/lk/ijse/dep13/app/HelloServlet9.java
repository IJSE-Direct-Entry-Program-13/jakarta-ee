package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/hello")
public class HelloServlet9 extends HttpServlet {
    static{
        System.out.println("HelloServlet9 class is being initialized");
    }

    public HelloServlet9() {
        System.out.println("HelloServlet9 instance is being initialized");
    }
}
