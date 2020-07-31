package factory;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

/**
 * Shape get instance class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class GetInstance {

    /**
     * Create a new Circle instance
     *
     * @param
     * @return Circle
     */
    public static Shape getCircleInstance() {
        System.out.println("I am Circle");
        return new Circle();
    }

    /**
     * Create a new Square instance
     *
     * @param
     * @return Square
     */
    public static Shape getSquareInstance() {
        System.out.println("I am Square");
        return new Square();
    }

    /**
     * Create a new Rectangle instance
     *
     * @param
     * @return Rectangle
     */
    public static Shape getRectangleInstance() {
        System.out.println("I am Rectangle");
        return new Rectangle();
    }
}
