/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * Represents a Circle, extending the abstract Shape class and adding specific
 * properties such as radius.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public class Circle extends Shape {

    private double radius; // Radius of the circle

    /**
     * Constructs a new Circle instance with specified ID, radius, color, and
     * filled status.
     *
     * @param ID Unique identifier for the circle.
     * @param radius Radius of the circle, must be a positive number.
     * @param color Color of the circle.
     * @param isFilled Indicates whether the circle is filled or not.
     */
    public Circle(String ID, double radius, String color, boolean isFilled) {
        super(ID, color, isFilled); // Call the superclass constructor to set ID, color, and filled status
        this.radius = radius; // Initialize the radius of the circle
    }

    /**
     * Validates the circle's dimensions. Ensures the radius is a positive
     * value.
     *
     * @return true if the radius is greater than zero, false otherwise.
     */
    @Override
    public boolean validate() {
        return radius > 0; // Validation condition for the circle
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius as a double.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle. The radius must be a positive value.
     *
     * @param radius the new radius to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area calculated using the formula π * radius^2.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area formula for the circle
    }

    /**
     * Calculates the perimeter (or circumference) of the circle.
     *
     * @return the perimeter calculated using the formula 2 * π * radius.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Perimeter formula for the circle
    }

    /**
     * Displays a detailed profile of the circle, printing the formatted string
     * representation.
     */
    @Override
    public void showProfile() {
        System.out.println(this.toString()); // Print the detailed description of the circle
    }

    /**
     * Provides a string representation of the circle, including ID, date
     * created, color, fill status, and calculated area and perimeter.
     *
     * @return A formatted string with detailed circle information.
     */
    @Override
    public String toString() {
        return "|Circle:    " + super.toString() + String.format("| %3.1f|  - |  - | %6.1f| %6.1f|",
                radius, getArea(), getPerimeter()); // Concatenate circle-specific details to the generic shape details
    }

}
