package cn.hashdata.grafana.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class GrafanaApplication {
  public static void main(String[] args) {
    SpringApplication application =
        new SpringApplicationBuilder(GrafanaApplication.class).application();
    ApplicationContext ctx = application.run(args);
    DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
    dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
  }
}
