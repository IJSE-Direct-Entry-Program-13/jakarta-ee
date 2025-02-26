package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/hello7")
public class HelloServlet7 extends HttpServlet {
    static{
        System.out.println("HelloServlet7 class is being initialized");
    }

    public HelloServlet7() {
        System.out.println("HelloServlet7 instance is being initialized");
    }
}
