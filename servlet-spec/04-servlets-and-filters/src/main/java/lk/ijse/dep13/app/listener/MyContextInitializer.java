package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContext;

public interface MyContextInitializer {
    void onStartup(ServletContext servletContext);
}
