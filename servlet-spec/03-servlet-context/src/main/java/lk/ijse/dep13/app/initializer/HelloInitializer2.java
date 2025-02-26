package lk.ijse.dep13.app.initializer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class HelloInitializer2 implements WebApplicationInitializer {

    static {
        System.out.println("HelloInitializer2 class is being initialized");
    }

    public HelloInitializer2() {
        System.out.println("HelloInitializer2 instance is being initialized");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("HelloInitializer2 get notified with context reference");
    }
}
