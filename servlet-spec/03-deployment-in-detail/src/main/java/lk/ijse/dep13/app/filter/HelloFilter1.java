package lk.ijse.dep13.app.filter;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;

@WebFilter(filterName = "HelloFilter1",
        value = "/*",
        initParams = {
                @WebInitParam(name = "param1", value = "filter-value1"),
                @WebInitParam(name = "param2", value = "filter-value2")
        })
public class HelloFilter1 extends HttpFilter {

    static {
        System.out.println("HelloFilter1 class is being initialized");
    }

    public HelloFilter1() {
        System.out.println("HelloFilter1 instance is being initialized");
    }
}
