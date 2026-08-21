package javaFundamentals;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        int teen = 13;
        int kid = 4;
        //int legalAge = 18; pwede if compare like (age >= legalAge)
        if(age >= 18){
            System.out.println("You have access!"); // if >18 lang di kasama 18
        }else if(age >= teen ){
            System.out.println("You need parent consent");
        }else if(age >= kid){
            System.out.println("You are a kid");
        }else{
            System.out.println("You are a baby WTF bro");
        }

        //can remove curly braces {} if one liner lang conditions 

        

        

    }
}
