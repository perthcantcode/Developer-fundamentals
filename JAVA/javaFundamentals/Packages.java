package javaFundamentals;

import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean finished = false;

        while (!finished) {
            System.out.print("Enter an age as a number or text: ");
            String input = scan.nextLine();

            try {
                // Converts a numeric String such as "9" into the int 9.
                int age = Integer.parseInt(input);
                System.out.println("You entered the integer age: " + age);
                finished = true;
            } catch (NumberFormatException e) {
                // If parsing fails, accept the input as a String instead.
                System.out.println("You entered the String age: " + input);
                finished = true;
            } finally {
                System.out.println("This runs after every attempt.");
            }
        }

        scan.close();
        System.out.println("Program finished.");
    }
}
