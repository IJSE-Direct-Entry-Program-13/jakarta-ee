package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 0,
        initParams = {
                @WebInitParam(name = "param1", value = "servlet-value1"),
                @WebInitParam(name = "param2", value = "servlet-value2")
        })
public class HelloServlet1 extends HttpServlet {
    static {
        System.out.println("HelloServlet1 class is being initialized");
    }

    public HelloServlet1() {
        System.out.println("HelloServlet1 instance is being initialized");
    }
}
