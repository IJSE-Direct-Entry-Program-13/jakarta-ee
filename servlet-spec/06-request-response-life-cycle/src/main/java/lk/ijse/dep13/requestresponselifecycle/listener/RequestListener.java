package lk.ijse.dep13.requestresponselifecycle.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    static{
        System.out.println("RequestListener class object is being initialized");
    }
    public RequestListener() {
        System.out.println("RequestListener object is being initialized");
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("RequestListener initialized");
        System.out.println("Servlet Request: " + sre.getServletRequest());
        System.out.println("Servlet Context: " + sre.getServletContext());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("RequestListener destroyed");
        System.out.println("Servlet Request: " + sre.getServletRequest());
        System.out.println("Servlet Context: " + sre.getServletContext());
    }
}
