/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * Abstract class representing a Quadrilateral, which is a specific type of
 * Shape. This class serves as a base for quadrilateral shapes like rectangles
 * and squares.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public abstract class Quadrilateral extends Shape {

    protected double width;  // Width of the quadrilateral
    protected double height; // Height of the quadrilateral

    /**
     * Constructor for the Quadrilateral class. Initializes a new instance of
     * Quadrilateral with specified details.
     *
     * @param ID Unique identifier for the quadrilateral.
     * @param width Width of the quadrilateral, must be a positive number.
     * @param height Height of the quadrilateral, must be a positive number.
     * @param color Color of the quadrilateral.
     * @param isFilled Indicates whether the quadrilateral is filled or not.
     */
    public Quadrilateral(String ID, double width, double height, String color, boolean isFilled) {
        super(ID, color, isFilled);  // Call the superclass constructor to set ID, color, and filled status
        this.width = width;          // Initialize the width of the quadrilateral
        this.height = height;        // Initialize the height of the quadrilateral
    }

    /**
     * Validates the dimensions of the quadrilateral. Ensures both width and
     * height are positive values.
     *
     * @return true if both width and height are greater than zero, false
     * otherwise.
     */
    @Override
    public boolean validate() {
        return width > 0 && height > 0; // Validation condition for the quadrilateral
    }

    /**
     * Returns the width of the quadrilateral.
     *
     * @return the width as a double.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the quadrilateral. The width must be a positive value.
     *
     * @param width the new width to set.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height of the quadrilateral.
     *
     * @return the height as a double.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the quadrilateral. The height must be a positive
     * value.
     *
     * @param height the new height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the quadrilateral.
     *
     * @return the area calculated using the formula width * height.
     */
    @Override
    public double getArea() {
        return width * height; // Area formula for the quadrilateral
    }

    /**
     * Calculates the perimeter of the quadrilateral.
     *
     * @return the perimeter calculated using the formula 2 * (width + height).
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height); // Perimeter formula for the quadrilateral
    }
}
