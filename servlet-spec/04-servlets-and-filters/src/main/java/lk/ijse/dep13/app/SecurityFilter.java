package lk.ijse.dep13.app;

import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;

@WebFilter(filterName = "security-filter", servletNames = "customer-servlet",
initParams = @WebInitParam(name = "param1", value = "value1"))
public class SecurityFilter extends HttpFilter {

    static {
        System.out.println("SecurityFilter class is being initialized");
    }

    public SecurityFilter() {
        System.out.println("An instance of SecurityFilter is being initialized");

    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
        System.out.println(getServletContext());
        System.out.println(getInitParameter("param1"));
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init(FilterConfig)");
        System.out.println("Before FilterConfig: " + getFilterConfig());
        super.init(config);
        System.out.println("After FilterConfig: " + getFilterConfig());
    }

    @Override
    public void destroy() {
        System.out.println("Someone is about to kill me");
    }
}
