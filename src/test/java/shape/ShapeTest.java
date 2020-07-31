package shape;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Shape test class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(Shape.class)
public class ShapeTest {

    @Test
    public void testDrawCircle() throws Exception {
        Shape circle = PowerMockito.spy(new Circle());

        PowerMockito.doNothing().when(circle, "preprocessing");
        PowerMockito.doNothing().when(circle).performDrawing();
        PowerMockito.doNothing().when(circle, "postprocessing");

        circle.draw();

        PowerMockito.verifyPrivate(circle).invoke("preprocessing");
        Mockito.verify(circle).performDrawing();
        PowerMockito.verifyPrivate(circle).invoke("postprocessing");
    }

    @Test
    public void testDrawRectangle() throws Exception {
        Shape rectangle = PowerMockito.spy(new Rectangle());

        PowerMockito.doNothing().when(rectangle, "preprocessing");
        PowerMockito.doNothing().when(rectangle).performDrawing();
        PowerMockito.doNothing().when(rectangle, "postprocessing");

        rectangle.draw();

        PowerMockito.verifyPrivate(rectangle).invoke("preprocessing");
        Mockito.verify(rectangle).performDrawing();
        PowerMockito.verifyPrivate(rectangle).invoke("postprocessing");
    }

    @Test
    public void testDrawSquare() throws Exception {
        Shape square = PowerMockito.spy(new Square());

        PowerMockito.doNothing().when(square, "preprocessing");
        PowerMockito.doNothing().when(square).performDrawing();
        PowerMockito.doNothing().when(square, "postprocessing");

        square.draw();

        PowerMockito.verifyPrivate(square).invoke("preprocessing");
        Mockito.verify(square).performDrawing();
        PowerMockito.verifyPrivate(square).invoke("postprocessing");
    }
}
