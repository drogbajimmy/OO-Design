package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import shape.Circle;
import shape.Shape;

@ComponentScan({"aspect", "shape"})
@SpringBootApplication
public class ShapeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShapeApplication.class, args);
    }
}
