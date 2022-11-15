# Restaurant Spring REST exercise

Clone this repo to test your understanding of Spring Boot, Dependency Injection and REST Mappings!

Your job is to complete the codebase so the API fulfills all functionality seen in class.  

 * Fork this project.
 * Revise the [ResTL model](markdown/ResTL.png) and identify the required input and output body payloads.
 * Complete the backend **[Model-Package](src/main/java/eu/kartoffelquadrat/restaurant/model)** code.
 * Create and implement new REST Controllers where needed.
 * Use Dependency injection where needed.  
 > Avoid binding your REST controllers to specific implementation classes! Always use interfaces for injection parameters.
 * Write new Unit Tests for your added code. Maintain the coverage above 80% LOCs.
 * Use [ARC](https://github.com/advanced-rest-client/arc-electron/releases) to create an interface specification and generate client code.

## Usage

Use below commands to build or run the service.

### Run
```
mvn clean package spring-boot:run
```
### Build & Run
 ```
mvn clean package
java -jar target/restaurant.jar
```

## Code Documentation

JavaDoc API is available on [GitHub Pages](https://kartoffelquadrat.github.io/Restaurant).

## Author & Pull Requests

[Maximilian Schiedermeier](https://www.cs.mcgill.ca/~mschie3/) on [GitHub](https://github.com/kartoffelquadrat).