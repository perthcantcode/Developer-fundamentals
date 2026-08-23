package javaFundamentals;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char grade = 'A';

        switch(grade){
            case 'A' :
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Satisfaction");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        String stats = "admin";

        switch(stats){
            case "admin":
                System.out.println("Hi, Admin");
                break;
            case "user":
                System.out.println("Hi, user");
                break;
            default:
                System.out.println("Invalid ");
        }

        int level = 1;

        switch(level){
            case 1 :
                System.out.println("Beginner");
                break;
            case 2:
                System.out.println("Intermidiate");
            case 3:
                System.out.println("Pro");
                break;
            default:
                System.out.println("Noob");
        }

        //CHALLENGE #4 DATE FORMATTER

        System.out.println("Enter Month : ");
        int month = sc.nextInt();

        System.out.println("Enter Date: ");
        int date = sc.nextInt();

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        

    }
}
