package lk.ijse.dep13.app.filter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter(urlPatterns = "/*")
public class HelloFilter2 extends HttpFilter {

    static{
        System.out.println("HelloFilter2 class is being initialized");
    }

    public HelloFilter2() {
        System.out.println("HelloFilter2 instance is being initialized");
    }
}
