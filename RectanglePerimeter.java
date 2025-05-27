
// RectanglePerimeter.java
public class RectanglePerimeter {
    // Attributes
    double length;
    double breadth;

    // Constructor to initialize values
    public RectanglePerimeter(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate and return the perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a RectanglePerimeter object
        RectanglePerimeter rect = new RectanglePerimeter(10.0, 5.0);

        // Calculating and displaying the perimeter
        double perimeter = rect.calculatePerimeter();
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
}
