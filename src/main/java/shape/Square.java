package shape;

import aspect.Draw;
import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

    public Square() {

    }

    @Override
    @Draw
    public void draw() {
        System.out.println("Square draw() execution");
    }
}
