package lk.ijse.dep13.app.filter;

import jakarta.servlet.http.HttpFilter;

public class HelloFilter4 extends HttpFilter {

    static{
        System.out.println("HelloFilter4 class is being initialized");
    }

    public HelloFilter4() {
        System.out.println("HelloFilter4 instance is being initialized");
    }
}
