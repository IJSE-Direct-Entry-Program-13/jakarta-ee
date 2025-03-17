import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ServletRequest {
    String getMethod();
}

interface ServletResponse {
}

interface HttpServletRequest extends ServletRequest {
}

interface HttpServletResponse extends ServletResponse {
}

interface Filter {
    void doFilter(ServletRequest req, ServletResponse res, FilterChain chain);
}

interface Servlet {
    void service(ServletRequest req, ServletResponse res);
}

interface FilterChain {
    void doFilter(ServletRequest req, ServletResponse res);
}

public class DEPContainer {

    public static void main(String[] args) {
        // Create Request and Response
        ServletRequest request = new HttpServletRequestImpl("POST");
        ServletResponse response = new HttpServletResponseImpl();

        // Consult Servlet Context and create a filter chain instance
        List<Filter> filters = new ArrayList<>(List.of(new MyFilter1(), new MyFilter2()));
        List<Servlet> servlets = new ArrayList<>(List.of(new MyServlet()));
        FilterChain chain = new ApplicationFilterChain(new ArrayList<>(List.of(filters.get(1), servlets.get(0))));
        chain.doFilter(request, response);
    }
}

abstract class GenericFilter implements Filter {
}

abstract class HttpFilter extends GenericFilter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) {
        doFilter((HttpServletRequest) req, (HttpServletResponse) res, chain);
    }

    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
        chain.doFilter(req, res);
    }
}

abstract class GenericServlet implements Servlet {
}

abstract class HttpServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) {
        service((HttpServletRequest) req, (HttpServletResponse) res);
    }

    public void service(HttpServletRequest req, HttpServletResponse res) {
        switch (req.getMethod()) {
            case "GET" -> doGet(req, res);
            case "POST" -> doPost(req, res);
            case "PUT" -> doPut(req, res);
            case "DELETE" -> doDelete(req, res);
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
    }

    public void doDelete(HttpServletRequest req, HttpServletResponse res) {
    }

    public void doPut(HttpServletRequest req, HttpServletResponse res) {
    }
}

class ApplicationFilterChain implements FilterChain {

    private List<Object> filterChain;

    public ApplicationFilterChain(List<Object> filterChain) {
        this.filterChain = filterChain;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res) {
        Object o = filterChain.removeFirst();
        if (o instanceof HttpFilter filter) {
            filter.doFilter(req, res, this);
        } else if (o instanceof HttpServlet servlet) {
            servlet.service(req, res);
        } else {
            // 404 Not Found
        }
    }
}

class HttpServletRequestImpl implements HttpServletRequest {
    private String method;

    public HttpServletRequestImpl(String method) {
        this.method = method;
    }

    @Override
    public String getMethod() {
        return this.method;
    }
}

class HttpServletResponseImpl implements HttpServletResponse {
}

class MyFilter1 extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
        System.out.println("MyFilter1");
        super.doFilter(req, res, chain);
    }
}

class MyFilter2 extends HttpFilter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) {
        System.out.println("MyFilter2");
        super.doFilter(req, res, chain);
    }
}

class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("MyServlet: doGet");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("MyServlet: doPost");
    }
}