
// Rectangle.java
public class Rectangle {
    // Attributes
    double length;
    double breadth;

    // Constructor to initialize values
    public Rectangle(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate and return area
    public double calculateArea() {
        return length * breadth;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rect1 = new Rectangle(5.0, 3.0);

        // Calculating and displaying the area
        double area = rect1.calculateArea();
        System.out.println("Area of the Rectangle: " + area);
    }
}
