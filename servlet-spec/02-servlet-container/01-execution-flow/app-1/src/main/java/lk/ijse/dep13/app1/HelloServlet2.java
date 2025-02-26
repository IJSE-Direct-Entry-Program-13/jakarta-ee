package lk.ijse.dep13.app1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet {

    static{
        System.out.println("Static Initializer: HelloServlet2");
    }

    {
        System.out.println("Instance Initializer: HelloServlet2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("HelloServlet2: I am from App 1");
    }
}
