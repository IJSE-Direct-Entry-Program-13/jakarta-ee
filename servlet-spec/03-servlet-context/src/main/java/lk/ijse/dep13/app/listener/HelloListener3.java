package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HelloListener3 implements ServletContextAttributeListener {

    static{
        System.out.println("HelloListener3 class is being initialized");
    }

    public HelloListener3() {
        System.out.println("HelloListener3 instance is being initialized");
    }

}
