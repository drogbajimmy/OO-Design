package factory;

import shape.Shape;

import java.util.function.Supplier;

/**
 * Shape enum class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public enum ShapeEnum {

    CIRCLE(GetInstance::getCircleInstance),
    RECTANGLE(GetInstance::getRectangleInstance),
    SQUARE(GetInstance::getSquareInstance);

    private final Supplier<Shape> constractor;

    ShapeEnum(Supplier<Shape> constractor) {
        this.constractor = constractor;
    }

    public Supplier<Shape> getConstractor() {
        return constractor;
    }

}
