/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * Represents a rectangle, a specific type of quadrilateral with four right
 * angles. This class extends Quadrilateral to utilize its width and height
 * properties.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public class Rectangle extends Quadrilateral {

    /**
     * Constructs a new Rectangle instance with specified ID, width, height,
     * color, and filled status.
     *
     * @param ID Unique identifier for the rectangle.
     * @param width Width of the rectangle, must be a positive number.
     * @param height Height of the rectangle, must be a positive number.
     * @param color Color of the rectangle.
     * @param isFilled Indicates whether the rectangle is filled or not.
     */
    public Rectangle(String ID, double width, double height, String color, boolean isFilled) {
        super(ID, width, height, color, isFilled); // Call the superclass constructor to initialize common properties
    }

    /**
     * Displays a detailed profile of the rectangle, providing its unique
     * properties. This method prints the rectangle's details, including its
     * dimensions, area, and perimeter.
     */
    @Override
    public void showProfile() {
        System.out.println(this.toString()); // Output the string representation of the rectangle
    }

    /**
     * Provides a string representation of the rectangle, including ID, creation
     * date, color, fill status, width, height, and calculated area and
     * perimeter.
     *
     * @return A formatted string with detailed rectangle information.
     */
    @Override
    public String toString() {
        // Concatenate rectangle-specific details to the generic quadrilateral details
        return "|Rectangle: " + super.toString() + String.format("| %3.1f| %3.1f|  - | %6.1f| %6.1f|",
                width, height, getArea(), getPerimeter());
    }
}
