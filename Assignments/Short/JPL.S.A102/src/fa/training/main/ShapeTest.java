package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Rectangle;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of rectangle: ");
        int n = scanner.nextInt();

        Rectangle[] rectangles = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle " + (i + 1) + ": ");
            rectangles[i] = new Rectangle();

            System.out.print("Enter length: ");
            int length = scanner.nextInt();

            System.out.print("Enter width: ");
            int width = scanner.nextInt();
            
            rectangles[i].setLengthWidth(length, width);
            System.out.println("--------------------------------");
        }

        // Display
        int maxAreaIndex = 0, minPerimeterIndex = 0;
        System.out.println("RECTANGLES INFO");
        for (int i = 0; i < n; i++) {
            System.out.println("Rectangle " + (i + 1));
            System.out.println("Length: " + rectangles[i].getLength());
            System.out.println("Width: " + rectangles[i].getWidth());
            System.out.println("Perimeter: " + rectangles[i].calculatePerimeter());
            System.out.println("Area: " + rectangles[i].calculateArea());
            System.out.println("--------------------------------");
            if (rectangles[maxAreaIndex].calculateArea() < rectangles[i].calculateArea())
                maxAreaIndex = i;
            if (rectangles[minPerimeterIndex].calculatePerimeter() > rectangles[i].calculatePerimeter())
                minPerimeterIndex = i;
        }

        System.out.println("Rectangle with maximum area:");
        System.out.println("Length: " + rectangles[maxAreaIndex].getLength());
        System.out.println("Width: " + rectangles[maxAreaIndex].getWidth());

        System.out.println("Rectangle with minimum perimeter:");
        System.out.println("Length: " + rectangles[minPerimeterIndex].getLength());
        System.out.println("Width: " + rectangles[minPerimeterIndex].getWidth());

        scanner.close();
    }
}
