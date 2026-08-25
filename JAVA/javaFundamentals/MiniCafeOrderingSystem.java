package javaFundamentals;

import java.util.Scanner;

public class MiniCafeOrderingSystem {
    public static void main(String[] args) {
        double money = 10.00;
        boolean isOpen = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mini Cafe!");

        while(isOpen){
            System.out.println("\nMenu: 1. Coffee ($3) | 2. Snack | 3. Check Wallet | 4. Leave");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 3:
                    System.out.println("You have $" + money + " left.");
                    break;
                case 4:
                    isOpen = false;
                    System.out.println("Thanks for visiting!");
                    break;
            }

        }



    }
}
