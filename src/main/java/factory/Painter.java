package factory;

import shape.Shape;

/**
 * Shape factory class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class Painter {

    /**
     * Create a shape factory instance
     *
     * @param type Specified shape type
     * @return Shape
     */
    public static Shape factory(ShapeEnum type) {
        return type.getConstractor().get();
    }
}
