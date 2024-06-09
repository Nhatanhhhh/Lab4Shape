/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * Represents a Triangle, a geometric shape with three sides. This class extends
 * the abstract Shape class, adding properties and methods specific to
 * triangles.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public class Triangle extends Shape {

    private double side1; // Length of the first side of the triangle
    private double side2; // Length of the second side of the triangle
    private double side3; // Length of the third side of the triangle

    /**
     * Constructs a new Triangle instance with specified ID, side lengths,
     * color, and filled status.
     *
     * @param ID Unique identifier for the triangle.
     * @param side1 Length of the first side.
     * @param side2 Length of the second side.
     * @param side3 Length of the third side.
     * @param color Color of the triangle.
     * @param isFilled Indicates whether the triangle is filled or not.
     */
    public Triangle(String ID, double side1, double side2, double side3, String color, boolean isFilled) {
        super(ID, color, isFilled); // Call to the superclass constructor to initialize common properties
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Validates the dimensions of the triangle. Ensures that the side lengths
     * satisfy the triangle inequality theorem and that each side length is a
     * positive value.
     *
     * @return true if the side lengths form a valid triangle, false otherwise.
     */
    @Override
    public boolean validate() {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1) && side1 > 0 && side2 > 0 && side3 > 0;
    }

    /**
     * Returns the length of the first side of the triangle.
     *
     * @return the length of side1.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Sets the length of the first side of the triangle.
     *
     * @param side1 the new length for the first side.
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Returns the length of the second side of the triangle.
     *
     * @return the length of side2.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Sets the length of the second side of the triangle.
     *
     * @param side2 the new length for the second side.
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Returns the length of the third side of the triangle.
     *
     * @return the length of side3.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Sets the length of the third side of the triangle.
     *
     * @param side3 the new length for the third side.
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * Calculates the area of the triangle using Heron's formula.
     *
     * @return the area of the triangle.
     */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter of the triangle
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3; // Sum of all sides
    }

    /**
     * Displays a detailed profile of the triangle, providing its unique
     * properties. This method prints the triangle's details, including its
     * dimensions, area, and perimeter.
     */
    @Override
    public void showProfile() {
        System.out.println(this.toString()); // Output the string representation of the triangle
    }

    /**
     * Provides a string representation of the triangle, including ID, creation
     * date, color, fill status, side lengths, and calculated area and
     * perimeter.
     *
     * @return A formatted string with detailed triangle information.
     */
    @Override
    public String toString() {
        return "|Triangle:  " + super.toString() + String.format("| %3.1f| %3.1f| %3.1f| %6.1f| %6.1f|",
                side1, side2, side3, getArea(), getPerimeter());
    }
}
