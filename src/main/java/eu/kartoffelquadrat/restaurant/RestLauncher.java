package eu.kartoffelquadrat.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * This class powers up Spring and ensures the annotated beans are detected and autowired.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"eu.kartoffelquadrat.restaurant.model.order"})
public class RestLauncher {
  public static void main(String[] args) {

    SpringApplication.run(RestLauncher.class, args);
  }
}