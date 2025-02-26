package lk.ijse.dep13.app.initializer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class HelloInitializer1 implements WebApplicationInitializer {

    static {
        System.out.println("HelloInitializer1 class is being initialized");
    }

    public HelloInitializer1() {
        System.out.println("HelloInitializer1 instance is being initialized");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("HelloInitializer1 get notified with context reference");
    }
}
