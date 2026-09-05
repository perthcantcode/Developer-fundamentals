package javaFundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;

        while(validInput){
            try {
                System.out.print("Enter your age: ");
                int age = scan.nextInt();

                System.out.println("Your age is: " + age);
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid Input ! Please enter a valid Integer.");
                scan.nextLine();
            }finally{
                System.out.println(" === This runs after every attempt. === ");
            }
                scan.close();
                System.out.println("Program finished");
        }
    


    }
    /*public static void main(String[] args) {
        basicTryCatch();
        multipleCatchBlocks();
        tryCatchFinally();
        tryWithResources();
        throwingAnException();
    }

    // Use try-catch when code may fail while the program is running.
    private static void basicTryCatch() {
        System.out.println("\n1. Basic try-catch");

        try {
            int number = Integer.parseInt("9");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("The text is not a valid integer.");
        }
    }

    // Use different catch blocks when different errors need different messages.
    private static void multipleCatchBlocks() {
        System.out.println("\n2. Multiple catch blocks");

        try {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println("You entered: " + number);
            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Input error: please enter a whole number.");
        } catch (IllegalStateException e) {
            System.out.println("Scanner error: the scanner is already closed.");
        }
    }
    // finally runs whether an exception occurs or not.
    private static void tryCatchFinally() {
        System.out.println("\n3. try-catch-finally");

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Math error: division by zero is not allowed.");
        } finally {
            System.out.println("This cleanup code always runs.");
        }
    }

    // try-with-resources automatically closes resources such as files and scanners.
    private static void tryWithResources() {
        System.out.println("\n4. try-with-resources");

        File file = new File("example.txt");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File error: the file could not be opened.");
        }
    }

    // Use throw when your code detects an invalid condition.
    private static void throwingAnException() {
        System.out.println("\n5. throw and catch");

        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }

    private static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You must be at least 18 years old.");
        }

        System.out.println("Age is valid.");
    }

    */
}
