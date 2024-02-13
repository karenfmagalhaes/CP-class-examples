package griffith;

import java.util.Scanner;

public class DataType {
    public static void main(String [] args) { //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in); //Prompt the user to enter the width of the paper
        System.out.print("Length is ");
        double width = scanner.nextDouble(); // Prompt the user to enter the length of the paper
        System.out.print("Width is ");
        double length = scanner.nextDouble(); // Calculate the perimeter of the retangle
        double perimeter = 2 * (width + length); // Display the perimeter of the paper
        System.out.println("The perimeter of the paper is " + perimeter);

        //Close the Scanner

        scanner.close();
    }
    }