package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HelloListener5 implements ServletRequestAttributeListener {

    static{
        System.out.println("HelloListener5 class is being initialized");
    }

    public HelloListener5() {
        System.out.println("HelloListener5 instance is being initialized");
    }

}
