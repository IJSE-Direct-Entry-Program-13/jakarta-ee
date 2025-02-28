package lk.ijse.dep13.app.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class HelloListener7 implements HttpSessionAttributeListener {

    static{
        System.out.println("HelloListener7 class is being initialized");
    }

    public HelloListener7() {
        System.out.println("HelloListener7 instance is being initialized");
    }

}
