package shape;

import aspect.Draw;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    public Circle() {

    }

    @Override
    @Draw
    public void draw() {
        System.out.println("Circle draw() execution");
    }
}
