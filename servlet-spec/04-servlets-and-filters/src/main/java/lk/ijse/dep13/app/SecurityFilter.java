package lk.ijse.dep13.app;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter(filterName = "security-filter", servletNames = "customer-servlet")
public class SecurityFilter extends HttpFilter {

    static {
        System.out.println("SecurityFilter class is being initialized");
    }

    public SecurityFilter() {
        System.out.println("An instance of SecurityFilter is being initialized");
    }
}
