package javaFundamentals;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        //int legalAge = 18; pwede if compare like (age >= legalAge)
        if(age >= 18){
            System.out.println("You have access!"); // if >18 lang di kasama 18
        }else{
            System.out.println("Access Denied !");
        }


    }
}
