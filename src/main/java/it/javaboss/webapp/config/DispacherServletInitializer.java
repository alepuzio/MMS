package it.javaboss.webapp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Controller
public class DispacherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private /*final*/ TemplateEngine templateEngine;

	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.info(">getRootConfigClasses");
		return null;
	}

	/**
	 * */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info(">getServletConfigClasses");
		return new Class[]{
				WebApplicationContextConfig.class
		};
	}

	/**
	 * 
	 * It manages the request to our application
	 * */
	@Override
	protected String[] getServletMappings() {
		logger.info(">getServletMappings");
		return new String[]{"/"};
	}

	/**
	 * It works as web.xml
	 * */
    @Override
    public void onStartup(ServletContext servletContext) {
		logger.info(">onStartup");
        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebApplicationContextConfig.class);
        // Create and register the DispatcherServlet
        ServletRegistration.Dynamic registration = servletContext.addServlet("mms", new DispatcherServlet(context));
        registration.setLoadOnStartup(1);
        registration.addMapping("/mms/*");
        
         this.templateEngine = new TemplateEngine();
        this.templateEngine.setTemplateResolver(templateResolver(servletContext));
    }
    

	 public ServletContextTemplateResolver templateResolver(ServletContext servletContext) {
	        //ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
	        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
	        //templateResolver.setPrefix("/WEB-INF/templates/");
	        
	        templateResolver.setPrefix("/templates/");
	        templateResolver.setSuffix(".html");//o jps
	        templateResolver.setTemplateMode(TemplateMode.HTML);
	        templateResolver.setCharacterEncoding("UTF-8");
	        templateResolver.setOrder(0);  // this is important. This way spring //boot will listen to both places 0 and 1
	        templateResolver.setCacheable(false);
	        templateResolver.setCheckExistence(true);
	        templateResolver.setCacheTTLMs(Long.valueOf(3600000L));
	        
	        // Cache is set to true by default. Set to false if you want templates to
	        // be automatically updated when modified.
	        templateResolver.setCacheable(true);
	        
	        return templateResolver;
	    }

    
}
