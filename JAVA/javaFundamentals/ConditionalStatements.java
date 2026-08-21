package javaFundamentals;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        /* 
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

        //Nested Conditional Statement -> use to have check point
        System.out.print("Enter new age: ");
        int age1 = scan.nextInt();
        
        boolean isVerified = false; // if true then you have access abd qualified

        if(age1 >= 18){
            System.out.println("You have access !");

            if(isVerified)System.out.println("You are Qualified !");
            else System.out.println("Not Qualified");
        }
        scan.close();
        */

        //Equals function -> to compare variables ( == )
        //content yung cinocompare nya hindi memory address .equals kapag word      

        /* 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter greetings: ");
        String greet = scan.nextLine();
        if(greet.equalsIgnoreCase("Kumusta")) System.out.println("Ayos lang !");
        else System.out.println("Nudaw?");

        //.equalsIgnoreCase()
        //Logical Operators && -> And  || -> OR  ! -> NOT (babaliktarin)
        */

        Scanner s = new Scanner(System.in);
        boolean hasPen = false;
        boolean hasPaper = true;

        if(hasPen && hasPaper) System.out.println("You can join the class !");
        else if(hasPen || hasPaper) System.out.println(" are not allowed to come in");
        else System.out.println("Go home bud");

        System.out.println();
        
        int age = 18;
        boolean isVerif = true;

        if(age >= 18 && isVerif) System.out.println("You have access and qualified");
        else if(age >= 18 && !isVerif) System.out.println("You have access but not qualified !");
        else System.out.println("Access Denied !");

    }
}
