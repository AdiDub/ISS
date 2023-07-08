package Basic;

public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Set the state (instance variables) of the object
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        // Access and print the state
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Set the state (instance variables) of the object
        myRectangle.length = 5.0;
        myRectangle.width = 3.0;

        // Calculate and print the area
        double area = myRectangle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and print the perimeter
        double perimeter = myRectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
