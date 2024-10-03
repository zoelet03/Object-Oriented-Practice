/**
 * Rectangle class, extending Shape.
 *
 * Represents a rectangle with width and height.
 *
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructor for Rectangle.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        super(4);  // Rectangle always has 4 sides.
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the rectangle.
     *
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height The new height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * toString method to display the rectangle's details.
     */
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", sides=" + getSides() + ", area=" + getArea() + "]";
    }
}
