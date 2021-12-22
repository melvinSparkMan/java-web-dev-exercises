package studios.datatypes;

import studios.datatypes.*;

import java.util.Scanner;

public class areaofacircle {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("\nEnter a Radius: ");
        radius = input.nextDouble();
        area = Circle.getArea(radius);
        input.close();

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
