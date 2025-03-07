package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContext;

public class MyClass3 implements MyContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("MyClass3: onStartup");
    }
}
