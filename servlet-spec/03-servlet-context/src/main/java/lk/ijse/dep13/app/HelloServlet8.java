package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

public class HelloServlet8 extends HttpServlet {
    static{
        System.out.println("HelloServlet8 class is being initialized");
    }

    public HelloServlet8() {
        System.out.println("HelloServlet8 instance is being initialized");
    }
}
