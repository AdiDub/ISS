package Basic;

public class Rectangle {
    // State (instance variables)
    double length;
    double width;

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
