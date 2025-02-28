package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

public class HelloListener9 implements ServletContextListener {

    static{
        System.out.println("HelloListener9 class is being initialized");
    }

    public HelloListener9() {
        System.out.println("HelloListener9 instance is being initialized");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloListener9 get notified");
        System.out.println("Filter Registrations: ");
        sce.getServletContext().getFilterRegistrations().values().forEach(value ->{
            System.out.println(value.getName());
        });
        System.out.println("Servlet Registrations: ");
        sce.getServletContext().getServletRegistrations().values().forEach(value -> {
            System.out.println(value.getName());
        });
        System.out.println("========================");
    }
}
