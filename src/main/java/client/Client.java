package client;

import factory.Painter;
import factory.ShapeEnum;

/**
 * Shape client class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public class Client {

    public static void main(String[] args) {
        Painter.factory(ShapeEnum.CIRCLE).draw();
        Painter.factory(ShapeEnum.SQUARE).draw();
        Painter.factory(ShapeEnum.RECTANGLE).draw();
    }
}
