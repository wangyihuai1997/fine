package cn.com.pism.fine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author wangy
 */
@SpringBootApplication
public class FineApplication extends SpringBootServletInitializer {

    public FineApplication() {
        super();
        setRegisterErrorPageFilter(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(FineApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FineApplication.class);
    }

   /* @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new ReportServlet(), "/ReportServer");
    }

*/
}
