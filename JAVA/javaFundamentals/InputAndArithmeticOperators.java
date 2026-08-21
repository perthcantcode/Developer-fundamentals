package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {
    public static void main(String[] args){

        /*
        float numOne;
        float numTwo;
        float result1;
        float result2;
        float result3;
        float result4;
        float result5;
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Number: ");
        numOne = scan.nextFloat();

        System.out.print("Input Second Number: ");
        numTwo = scan.nextFloat();

        result1 = numOne + numTwo;
        result2 = numOne - numTwo;
        result3 = numOne * numTwo;

        System.out.println();
        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + numOne / numTwo);
        scan.close();

        */
        String x;
        int y;
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        x = scan1.nextLine();

        System.out.print("Enter a number: ");
        y = scan1.nextInt();

        System.out.println("You are " + x);
        System.out.print("Number: " + y);
        System.out.println();

        //Arithmetic operators
        // % Modulus - remainder
        // ++ Increment - adds 1
        // -- Decrement - subtracts 1

        int a =  5;
        int b = 2 ;
        int c = a / b;
        System.out.println("a + b  = " + (a+b));
        System.out.println("a / b = " + c ); // walang remainder
        System.out.println("a %  b = " + (a % b));
        System.out.println((a/b) + " remainder " + (a % b));
        a++;
        b--;
        System.out.println("Increment: " + a);//6
        System.out.println("Decrement" + a);//4

        scan1.close();
    }
}
