package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HelloListener4 implements ServletRequestListener {

    static{
        System.out.println("HelloListener4 class is being initialized");
    }

    public HelloListener4() {
        System.out.println("HelloListener4 instance is being initialized");
    }

}
