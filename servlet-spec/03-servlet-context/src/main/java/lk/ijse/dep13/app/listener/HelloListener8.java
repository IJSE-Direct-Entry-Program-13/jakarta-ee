package lk.ijse.dep13.app.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;

public class HelloListener8 implements HttpSessionAttributeListener {

    static{
        System.out.println("HelloListener8 class is being initialized");
    }

    public HelloListener8() {
        System.out.println("HelloListener8 instance is being initialized");
    }

}
