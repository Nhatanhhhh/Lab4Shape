/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manages a collection of shapes, providing functionalities to add shapes,
 * display them, and perform various operations like sorting by area and
 * searching by ID.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
class ShapeManagement {

    // Holds all listShapes managed by this class
    private ArrayList<Shape> listShapes = new ArrayList<>();
    // Scanner for reading user input
    private static Scanner sc = new Scanner(System.in);

    /**
     * Constructor for ShapeManagement. You can call loadSampleData here to
     * ensure that sample data is loaded as soon as an instance is created.
     */
    public ShapeManagement() {
        loadSampleData();  // Uncomment this if you want to load sample data on initialization
    }

    /**
     * Gets a non-empty input from the user input with error handling. This
     * method uses to make sure the input data satisfy the format of the real
     * number in the specific range.
     *
     * @param iMsg The message prompts the users to enter a real number.
     * @param eMgs The message prompts the users about the error if the input is
     * not a valid real number in the range.
     * @param min The min value of real number.
     * @param max The max value of real number.
     * @return The entered real number value in the specific range.
     */
    public static double getDouble(String iMsg, String eMgs, double min, double max) {
        //Create a while loop to make sure the users can enter the data until it is valid.
        while (true) {
            //Use to catch the exception.
            try {
                //Prompt the user to enter a real number.
                System.out.print(iMsg);
                //Read the user input and convert it to a string.
                String num1 = sc.nextLine().trim();
                //Check if the input is empty.
                if ("".equals(num1)) {
                    //Throw exception if the string is empty.
                    throw new Exception();
                }
                //Convert string in variable 'num1' to a real number.
                double num = Double.parseDouble(num1);
                //Check if the real number is in the range.
                if (num < min || num > max) {
                    //Throw exception if the real number is not in the range.
                    throw new Exception();
                }
                //Return the valid real number value in the range.
                return num;
            } catch (Exception e) {
                //Handle the exception if the input is not a valid real number in the range.
                System.out.println(eMgs + ", can not be empty!");
            }
        }
    }

    /**
     * Get the integer number with error handling. This number must be in the
     * specific range.
     *
     * @param iMgs The message prompts the users to enter a integer number.
     * @param eMgs The message prompts the users about the error if the input is
     * not a valid integer.
     * @param min The min value of the integer number.
     * @param max The max value of the integer number.
     * @return The entered integer number value which in the specific range.
     */
    public static int getInteger(String iMgs, String eMgs, int min, int max) {
        //Create a while loop to make sure the users can enter the data until it is valid.
        while (true) {
            try {
                //Prompt the user to enter a integer number.
                System.out.print(iMgs);
                //Read the user input and convert it to a integer number.
                int n = Integer.parseInt(sc.nextLine());
                //Check if the input data is in the specific range.
                if (n < min || n > max) {
                    //Throw exception if the integer number is not in the specific range.
                    throw new Exception();
                }
                //Return the valid integer number.
                return n;
            } catch (Exception e) {
                //Handle the exception if the input is not a integer number.
                System.out.println(eMgs + ", can not be empty!");
            }
        }
    }

    /**
     * Gets a non-empty string and in the specific length of string from the
     * user input with error handling.
     *
     * @param iMsg The message prompts the users to enter a string.
     * @param eMgs The message prompts the users about the error if the input is
     * not a valid string.
     * @param min The min length of the string.
     * @param max The max length of the string.
     * @return The entered non-empty string in the specific length of string.
     */
    public static String getString(String iMsg, String eMgs, int min, int max) {
        //Create a while loop to make sure the users can enter the data until it is valid.
        while (true) {
            //Use to catch the exception.
            try {
                //Prompt the user to enter a string.
                System.out.print(iMsg);
                //Read the user input and convert it to a string.
                String in = sc.nextLine();
                //Check if the input is empty.
                if ("".equals(in)) {
                    //Throw exception if the string is empty.
                    throw new Exception();
                }
                //Check if the input is in the specific length.
                if (in.length() < min || in.length() > max) {
                    //Throw exception if the string is not in the specific length.
                    throw new Exception();
                }
                //Return the valid string.
                return in;
            } catch (Exception e) {
                //Handle the exception if the input is not a valid string.
                System.out.println(eMgs + ", can not be empty!");
            }
        }
    }

    /**
     * Adds a shape to the collection after ensuring it has a unique ID and
     * meets the shape's dimensional validations.
     *
     * @param shape The shape object to add.
     */
    public void addShape(Shape shape) {
        if (!isIDUnique(shape.getID())) {
            System.out.println("Error: ID already exists. Please enter a different ID.");
            return;
        }
        if (!shape.validate()) {
            System.out.println("Error: Invalid shape dimensions.");
            return;
        }
        listShapes.add(shape);
        System.out.println(shape.getClass().getSimpleName() + " added.");
        shape.showProfile();
    }

    /**
     * Checks if a provided ID is unique within the existing collection of
     * shapes.
     *
     * @param id The ID to check against existing shapes.
     * @return true if the ID is unique, otherwise false.
     */
    private boolean isIDUnique(String id) {
        return listShapes.stream().noneMatch(shape -> shape.getID().equals(id));
    }

    /**
     * Displays all shapes managed by the system.
     */
    public void displayShapes() {
        if (listShapes.isEmpty()) {
            System.out.println("No shapes to display.");
            return;
        }
        System.out.println("------ List of Shapes ------");
        listShapes.forEach(Shape::showProfile);
    }

    /**
     * Displays the shape with the largest area within the collection.
     */
    public void displayLargestAreaShape() {
        if (listShapes.isEmpty()) {
            System.out.println("No shapes available.");
            return;
        }

        Shape largest = null;
        double maxArea = 0;
        for (Shape shape : listShapes) {
            double currentArea = shape.getArea();
            if (largest == null || currentArea > maxArea) {
                largest = shape;
                maxArea = currentArea;
            }
        }

        if (largest != null) {
            System.out.println("----- Shape with the Largest Area -----");
            largest.showProfile();
        }
    }

    /**
     * Sorts the shapes by their area in ascending order.
     */
    public void sortShapesByArea() {
        int n = listShapes.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Compare areas of adjacent shapes
                if (listShapes.get(j).getArea() > listShapes.get(j + 1).getArea()) {
                    // Swap shapes if they are in the wrong order
                    Shape temp = listShapes.get(j);
                    listShapes.set(j, listShapes.get(j + 1));
                    listShapes.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two shapes were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
        // Display the sorted list of shapes
        displayShapes();
    }

    /**
     * Searches for a shape by its ID and displays it if found.
     *
     * @param ID The ID of the shape to search for.
     */
    public void searchShape(String ID) {
        // Use a stream to find the first shape matching the given ID
        Shape foundShape = listShapes.stream().filter(shape -> shape.getID().equals(ID)).findFirst().orElse(null);
        if (foundShape == null) {
            // Notify if no shape with the given ID is found
            System.out.println("Shape not found.");
            return;
        }
        // Display the found shape
        System.out.println("Shape found:");
        foundShape.showProfile();
    }

    /**
     * Populates the list of shapes with predefined sample data. This method is
     * intended to be called when the system initializes to provide a set of
     * data to work with without user input.
     */
    public void loadSampleData() {
        // Sample shapes are created and added to the list
        listShapes.add(new Circle("C1", 8, "Red", true));
        listShapes.add(new Circle("C3", 3, "Pink", true));
        listShapes.add(new Rectangle("R1", 5.0, 3.0, "Blue", true));
        listShapes.add(new Triangle("T1", 3.0, 4.0, 5.0, "Green", true));
        listShapes.add(new Square("S1", 4.0, "Yellow", true));
    }
}
