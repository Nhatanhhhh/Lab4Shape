/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Abstract class representing the general concept of a Shape. This class
 * provides the template and common functionality for specific shape types.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public abstract class Shape {

    protected String ID; // Unique identifier for the shape
    protected String color; // Color of the shape
    protected boolean isFilled; // Flag indicating if the shape is filled
    protected Date dateCreated; // The date the shape was created
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Date format for displaying dateCreated

    /**
     * Returns the unique identifier of the shape.
     *
     * @return the ID of the shape
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets the unique identifier of the shape.
     *
     * @param ID the unique identifier to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Returns the color of the shape.
     *
     * @return the color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the shape.
     *
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if the shape is filled.
     *
     * @return true if the shape is filled, false otherwise
     */
    public boolean isIsFilled() {
        return isFilled;
    }

    /**
     * Sets the filled status of the shape.
     *
     * @param isFilled the filled status to set
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    /**
     * Returns the creation date of the shape.
     *
     * @return the date the shape was created
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Constructor for the Shape class. Initializes a new instance of Shape with
     * specified details.
     *
     * @param ID the unique identifier for the shape
     * @param color the color of the shape
     * @param isFilled whether the shape is filled or not
     */
    public Shape(String ID, String color, boolean isFilled) {
        this.ID = ID;
        this.color = color;
        this.isFilled = isFilled;
        this.dateCreated = new Date(); // Set the creation date to the current date and time
    }

    /**
     * Abstract method to calculate the area of the shape. Must be implemented
     * by subclasses.
     *
     * @return the area of the shape
     */
    public abstract double getArea();

    /**
     * Abstract method to calculate the perimeter of the shape. Must be
     * implemented by subclasses.
     *
     * @return the perimeter of the shape
     */
    public abstract double getPerimeter();

    /**
     * Abstract method to display detailed information about the shape. Must be
     * implemented by subclasses.
     */
    public abstract void showProfile();

    /**
     * Abstract method to validate the dimensions of the shape. Must be
     * implemented by subclasses.
     *
     * @return true if the shape's dimensions are valid, false otherwise
     */
    public abstract boolean validate();

    /**
     * Formats the dateCreated to a readable string.
     *
     * @return formatted date string
     */
    public String formatDate() {
        return dateFormat.format(dateCreated);
    }

    /**
     * Converts the shape details to a string format.
     *
     * @return a formatted string representing the shape details
     */
    @Override
    public String toString() {
        return String.format("|%3s|%s| %8s| %6b", ID, formatDate(), color, isFilled);
    }
}
