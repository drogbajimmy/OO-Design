package shape;

/**
 * Rectangle class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class Rectangle extends Shape {

    private double length;

    private double width;

    @Override
    public void performDrawing() {
        System.out.println("Rectangle performDrawing() execution");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
