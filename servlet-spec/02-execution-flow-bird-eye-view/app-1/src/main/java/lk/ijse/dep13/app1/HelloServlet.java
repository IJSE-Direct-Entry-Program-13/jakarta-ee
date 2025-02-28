package lk.ijse.dep13.app1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 0)
public class HelloServlet extends HttpServlet {

    static{
        System.out.println("Static Initializer: HelloServlet");
    }

    {
        System.out.println("Instance Initializer: HelloServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("HelloServlet: I am from App 1");
    }
}
