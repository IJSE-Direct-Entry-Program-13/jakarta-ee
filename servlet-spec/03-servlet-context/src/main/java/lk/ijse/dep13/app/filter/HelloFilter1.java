package lk.ijse.dep13.app.filter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter
public class HelloFilter1 extends HttpFilter {

    static{
        System.out.println("HelloFilter1 class is being initialized");
    }

    public HelloFilter1() {
        System.out.println("HelloFilter1 instance is being initialized");
    }
}
