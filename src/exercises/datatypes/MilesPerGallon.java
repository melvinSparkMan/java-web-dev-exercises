package exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double milesDriven;
        double gallonsOfGas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        milesDriven = input.nextDouble();
        System.out.println("Enter the number of gallons used:");
        gallonsOfGas = input.nextDouble();
        input.close();

        mpg = milesDriven/gallonsOfGas;

        System.out.println("The miles per gallon is " + mpg);
    }
}
