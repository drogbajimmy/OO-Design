package shape;

/**
 * Circle class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class Circle extends Shape {

    private double radius;

    @Override
    public void performDrawing() {
        System.out.println("Circle performDrawing() execution");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
