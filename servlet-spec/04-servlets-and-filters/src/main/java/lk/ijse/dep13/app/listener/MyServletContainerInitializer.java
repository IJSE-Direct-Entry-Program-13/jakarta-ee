package lk.ijse.dep13.app.listener;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.util.Set;

@HandlesTypes(MyContextInitializer.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("My Servlet Container Initializer");
        set.forEach(clz -> {
            try {
                MyContextInitializer instance =
                        (MyContextInitializer) clz.getConstructors()[0]
                                .newInstance();
                instance.onStartup(servletContext);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
