/**
 * Abstract class for shapes.
 * Base class for specific shape types.
 */
abstract class Shape {

    /**
     * Number of sides of the shape.
     * This field is private and can only be accessed through a getter.
     */
    private int sides;

    /**
     * Constructor to initialize the shape with a specified number of sides.
     *
     * @param sides the number of sides in the shape.
     */
    public Shape(int sides) {
        this.sides = sides;
    }

    /**
     * Retrieves the number of sides of the shape.
     *
     * @return the number of sides.
     */
    public int getSides() {
        return sides;
    }

    /**
     * Abstract method to calculate and return the area of the shape.
     * Subclasses must provide an implementation for this method.
     *
     * @return the area of the shape.
     */
    public abstract double getArea();
}

