package eu.kartoffelquadrat.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class powers up Spring and ensures the annotated beans are detected and autowired.
 */
@SpringBootApplication
public class RestLauncher {
  public static void main(String[] args) {

    SpringApplication.run(RestLauncher.class, args);
  }
}