/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce181843_lab4;

/**
 * This class serves as the main entry point for the shape management
 * application, providing a menu-driven interaction to manage shapes like
 * circles, triangles, rectangles, and squares.
 *
 * @author CE181843 - Nguyễn Nhật Anh - IA1803
 */
public class CE181843_LAB4 {

    /**
     * Main method that drives the program, offering a menu to add and manage
     * geometric shapes.
     *
     * @param args the command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Initialize the shape management system
        ShapeManagement manager = new ShapeManagement();

        // Variable to store user's menu choice
        int choice;

        // Main loop of the application
        do {
            // Display the main menu
            System.out.println("\n----- SHAPE MANAGEMENT MENU -----");
            System.out.println("1. Add a new Circle.");
            System.out.println("2. Add a new Triangle.");
            System.out.println("3. Add a new Rectangle.");
            System.out.println("4. Add a new Square.");
            System.out.println("5. Shows all Shapes.");
            System.out.println("6. The biggest area shape.");
            System.out.println("7. Sort ascending by shape area.");
            System.out.println("8. Search a shape.");
            System.out.println("9. Quit.");
            System.out.println("");

            // Prompt for user input and validate it
            choice = ShapeManagement.getInteger("Enter your choice (1-9): ", "Invalid choice", 1, 9);

            // Handle the user's menu selection
            switch (choice) {
                case 1:
                    // Add new Circle
                    System.out.println("----- Add new circle -----");
                    String circleId = ShapeManagement.getString("Enter Circle ID: ", "Invalid input.", 1, 10);
                    String circleColor = ShapeManagement.getString("Enter Circle Color: ", "Invalid color.", 1, 15);
                    double circleRadius = ShapeManagement.getDouble("Enter Circle Radius: ", "Invalid radius.", 1, 100);
                    Circle circle = new Circle(circleId, circleRadius, circleColor, true);
                    manager.addShape(circle);
                    break;
                case 2:
                    // Add new Triangle
                    System.out.println("----- Add new Triangle -----");
                    String triangleId = ShapeManagement.getString("Enter Triangle ID: ", "Invalid input.", 1, 10);
                    String triangleColor = ShapeManagement.getString("Enter Triangle Color: ", "Invalid color.", 1, 15);
                    double side1 = ShapeManagement.getDouble("Enter length of Side 1: ", "Invalid side length.", 1, 100);
                    double side2 = ShapeManagement.getDouble("Enter length of Side 2: ", "Invalid side length.", 1, 100);
                    double side3 = ShapeManagement.getDouble("Enter length of Side 3: ", "Invalid side length.", 1, 100);
                    Triangle triangle = new Triangle(triangleId, side1, side2, side3, triangleColor, true);
                    manager.addShape(triangle);
                    break;
                case 3:
                    // Add new Rectangle
                    System.out.println("----- Add new Rectangle -----");
                    String rectangleId = ShapeManagement.getString("Enter Rectangle ID: ", "Invalid input.", 1, 10);
                    String rectangleColor = ShapeManagement.getString("Enter Rectangle Color: ", "Invalid color.", 1, 15);
                    double rectangleWidth = ShapeManagement.getDouble("Enter Rectangle Width: ", "Invalid width.", 1, 100);
                    double rectangleHeight = ShapeManagement.getDouble("Enter Rectangle Height: ", "Invalid height.", 1, 100);
                    Rectangle rectangle = new Rectangle(rectangleId, rectangleWidth, rectangleHeight, rectangleColor, true);
                    manager.addShape(rectangle);
                    break;
                case 4:
                    // Add new Square
                    System.out.println("----- Add new Square -----");
                    String squareId = ShapeManagement.getString("Enter Square ID: ", "Invalid input.", 1, 10);
                    String squareColor = ShapeManagement.getString("Enter Square Color: ", "Invalid color.", 1, 15);
                    double squareSide = ShapeManagement.getDouble("Enter Side Length: ", "Invalid side length.", 1, 100);
                    Square square = new Square(squareId, squareSide, squareColor, true);
                    manager.addShape(square);
                    break;
                case 5:
                    // Display all shapes managed by the system
                    manager.displayShapes();
                    break;
                case 6:
                    // Display the shape with the largest area
                    manager.displayLargestAreaShape();
                    break;
                case 7:
                    // Sort shapes by their area in ascending order
                    manager.sortShapesByArea();
                    break;
                case 8:
                    // Search for a shape by its ID
                    System.out.print("Enter ID to search: ");
                    String searchID = ShapeManagement.getString("Enter the ID of the shape to search for: ", "Invalid ID format.", 1, 10);
                    manager.searchShape(searchID);
                    break;
                case 9:
                    // Exit the application
                    System.out.println("THANK YOU FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                    break;
                default:
                    // Handle invalid menu options
                    System.out.println("The function of application must be from 1 to 9!");
            }
        } while (choice != 9); // Loop until the user chooses to exit
    }
}
