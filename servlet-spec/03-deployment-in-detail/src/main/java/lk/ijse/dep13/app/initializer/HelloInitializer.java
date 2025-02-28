package lk.ijse.dep13.app.initializer;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@HandlesTypes(WebApplicationInitializer.class)
public class HelloInitializer implements ServletContainerInitializer {

    static{
        System.out.println("HelloInitializer class is being initialized");
    }

    public HelloInitializer() {
        System.out.println("HelloInitializer instance is being initialized");
    }

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("HelloInitializer onStartup get notified");
        System.out.println("Filter Registrations");
        servletContext.getFilterRegistrations().values()
                .forEach(f -> System.out.println(f.getName()));
        System.out.println("Servlet Registrations");
        servletContext.getServletRegistrations().values()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println("WebApplicationInitializers");
        set.forEach(System.out::println);
        for (Class<?> aClass : set) {
            try {
                WebApplicationInitializer instance =
                        (WebApplicationInitializer) aClass.getConstructors()[0].newInstance();
                instance.onStartup(servletContext);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("=======================");
    }
}
