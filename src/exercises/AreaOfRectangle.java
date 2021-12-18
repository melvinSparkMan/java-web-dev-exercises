package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double width;
        double length;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the Width:");
        width = input.nextDouble();
        System.out.println("Enter the Length:");
        length = input.nextDouble();
        input.close();

        area = width * length;

        System.out.println("The area is " + area);
    }
}
