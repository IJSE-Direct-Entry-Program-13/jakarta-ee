package lk.ijse.dep13.app.filter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

public class HelloFilter3 extends HttpFilter {

    static{
        System.out.println("HelloFilter3 class is being initialized");
    }

    public HelloFilter3() {
        System.out.println("HelloFilter3 instance is being initialized");
    }
}
