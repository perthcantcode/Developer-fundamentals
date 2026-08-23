package javaFundamentals;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char grade = 'A';

        /* 
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

        */
        //CHALLENGE #4 DATE FORMATTER

        System.out.print("Enter Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Date: ");
        int date = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();


        switch(month){
            case 1:
                System.out.println("January " + date + ", " + year);
                break;
            case 2:
                System.out.println("Febuary " + date + ", " + year);
                break;
            case 3:
                System.out.println("March " + date + ", " + year);
                break;
            case 4:
                System.out.println("April  " + date + ", " + year);
                break;
            case 5:
                System.out.println(:"May " + date + ", " + year);
                break;
            case 6:
                System.out.println("June" + date + ", " + year);
                break;
            case 7:
                System.out.println("July " + date + ", " + year);
                break;
            case 8:
                System.out.println("August " + date + " ," + year);
                break;
            case 9:
                System.out.println("September " + date + ", " + year);
                break;
            case 10:
                System.out.println("October " + date + ", " + year);
                break;
            case 11:
                
        }

    }
}
