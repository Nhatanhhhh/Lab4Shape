/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * Represents a Square, a specific type of quadrilateral where all sides are
 * equal. This class extends Quadrilateral and utilizes its properties for width
 * and height, which are identical in a square.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public class Square extends Quadrilateral {

    /**
     * Constructs a new Square instance with a specified ID, side length, color,
     * and filled status.
     *
     * @param ID Unique identifier for the square.
     * @param side Side length of the square, which is used for both width and
     * height.
     * @param color Color of the square.
     * @param isFilled Indicates whether the square is filled or not.
     */
    public Square(String ID, double side, String color, boolean isFilled) {
        super(ID, side, side, color, isFilled); // Pass side length as both width and height to the Quadrilateral constructor
    }

    /**
     * Displays a detailed profile of the square, providing its unique
     * properties. This method prints the square's details, including its
     * dimensions, area, and perimeter.
     */
    @Override
    public void showProfile() {
        System.out.println(this.toString()); // Output the string representation of the square
    }

    /**
     * Provides a string representation of the square, including ID, creation
     * date, color, fill status, side length, and calculated area and perimeter.
     *
     * @return A formatted string with detailed square information.
     */
    @Override
    public String toString() {
        // Concatenate square-specific details to the generic quadrilateral details
        return "|Square:    " + super.toString() + String.format("| %3.1f|  - |  - | %6.1f| %6.1f|",
                width, getArea(), getPerimeter());
    }
}
