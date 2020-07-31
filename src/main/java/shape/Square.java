package shape;

/**
 * Square class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class Square extends Shape {

    private double side;

    @Override
    public void performDrawing() {
        System.out.println("Square performDrawing() execution");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
