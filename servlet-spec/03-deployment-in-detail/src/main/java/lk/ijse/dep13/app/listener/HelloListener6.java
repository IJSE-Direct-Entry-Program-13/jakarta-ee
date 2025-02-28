package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class HelloListener6 implements HttpSessionListener {

    static{
        System.out.println("HelloListener6 class is being initialized");
    }

    public HelloListener6() {
        System.out.println("HelloListener6 instance is being initialized");
    }

}
