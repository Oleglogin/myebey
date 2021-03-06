package ua.lv.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by User on 13.01.2021.
 */
public class WebInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext)throws ServletException{
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        registration.setMultipartConfig(new MultipartConfigElement("",10000000,10000000,10000000));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }

}
