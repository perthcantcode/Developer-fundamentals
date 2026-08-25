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
                case 1:
                    if (money >= 3.0) {
                        money = money - 3.0;
                        System.out.println("You bought a Coffee. Enjoy!");
                    } else {
                        System.out.println("Not enough money for Coffee.");
                    }
                    break;
                case 2:
                    System.out.print("Which snack? 1. Donut ($2) | 2. Muffin ($4): ");
                    int snackChoice = scanner.nextInt();
                    double snackPrice = 0.0;

                    if (snackChoice == 1) {
                        snackPrice = 2.0;
                    } else if (snackChoice == 2) {
                        snackPrice = 4.0;
                    } else {
                        System.out.println("We don't have that snack.");
                        break; // Exits the switch case early
                    }

                    if (money >= snackPrice) {
                        money = money - snackPrice;
                        System.out.println("Snack purchased!");
                    } else {
                        System.out.println("Not enough money for the snack.");
                    }// End of case 2
                    break; // We will add more to this case next
                case 3:
                    System.out.println("You have $" + money + " left.");
                    break;
                case 4:
                    isOpen = false;
                    System.out.println("Thanks for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

        }



    }
}
