package shape;

/**
 * Abstract Shape class
 *
 * @author  Jimmy Zhou
 * @version 1.0
 * @since   2020-07-31
 */
public abstract class Shape {

    /**
     * Draw method
     *
     * @param
     * @return
     */
    public void draw() {
        preprocessing();
        performDrawing();
        postprocessing();
    }

    /**
     * Abstract performance drawing method
     *
     * @param
     * @return
     */
    protected abstract void performDrawing();

    /**
     * preprocessing method, which is always performed before performDrawing()
     *
     * @param
     * @return
     */
    private void preprocessing() {
        System.out.println("preprocessing() starts");
    }

    /**
     * postprocessing method, which is always performed after performDrawing()
     *
     * @param
     * @return
     */
    private void postprocessing () {
        System.out.println("postprocessing() starts");
    }
}
