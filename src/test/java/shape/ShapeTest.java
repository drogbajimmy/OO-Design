package shape;

import app.ShapeApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShapeApplication.class)
public class ShapeTest {

    @Autowired
    private Circle circle;

    @Autowired
    private Square square;

    @Test
    public void testCircleAspect() {

        circle.draw();
    }

    @Test
    public void testSquareAspect() {

        square.draw();
    }
}
