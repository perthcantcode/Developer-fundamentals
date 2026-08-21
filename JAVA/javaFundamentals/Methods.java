package javaFundamentals;
import java.util.*;

public class Methods {
//MAIN CLASS

    //Global Variables dito dinedeclare sa between ng curly braces ng  public class 
    //need din lagyan lagi ng static na modifier para gumana

    static String section = "2-4"; //kahit saan sa buong class pwede syang gamitin
    static int num = 100;


    public static void main(String[] args) {
        // MAIN  METHOD- ito lang nagrurun
        Scanner scan = new Scanner(System.in);

        //Call methods sa loob ng Main Method
        sayHello();  // nakabase sino mauuna sa pag call sa main method hindi sa naunang ideclare
        sayHi();

        // single line comment
        /*
        multiline comment
        */

        //Variable Scoping
        //Global Variables - variables declared within a class - can acces within the whole class

        //Local Var ->  declared inside a , condition, loops and any other 
        //block of code, it can  only be accesible within that block of code

        greet();
        saySection();
        sayNumber();
        /*
        String name = "David";

        if(name.equals("David")){
            int num = 25; // int num na variable is accesible lang within this if statement kaya error yung num sa labas
        }
 
        System.out.println(name);
        //System.out.println(num); ERROR yung (num) di kasi accesible
         */

    
        //ARGUMENT & PARAMETERS
        //value that needs to be passed on a method
        //that the method can use the value and perform various operations on it
        // PS  you can have many Arg / Para as u want. They act as a Local Var inside a method/.function

        //Method w/ Arguments
        //-> modifiers returntype 
        

        String a = "Ruperth";
        print("Hello " + a);

        add(5,5);
        bati("Perth", 19); // Ordering is important no matter what the data type
        //inside a parameter is.


        //RETURN KEYWORD
        //to get the value or result mismo ng method
        //used when method has a result

        //RETURN TYPE
        //type of value na marereturn
        // void returns nothing
        // int = integers, string = strings .. so on

        int sum = addition(2,2);
        int difference = subtract(2,2);
        int product = multiply(2,2);
        int quotient = divide(2,2);
        int remainder = modulus(2,2);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        
        System.out.println(isLegalAge(17));

        //OVERLOADING Methods
        //same method name but diff parameters
        //Duplicate methods and iba iba paramters

        System.out.println(add2(5,5));
        System.out.println(add3(5,5,5));
        System.out.println(add3(5.5,4.9,7.1));


    }

    static void sayHi(){
        System.out.println("Hi");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void greet(){
        //local var = accesible lang sa main method or greet method or specific block of code
        String greetings = "What's up";
        System.out.println(greetings);
    }

    static void saySection(){
        System.out.println(section);
    }

    static void sayNumber(){
        System.out.println(num);
    }

    static void print(String word){ // mag aact sya as taga  print since 1 parameter lang sya
        System.out.println(word);// pwede sya gamitin sa ibang methods
    }// e.g. gamitin sya sa bati(); method

    static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    static void bati(String name, int age){
        print("Hellow " + name ); // considered as 1 String dahil sa "  "
        print("You are "+ age + " years old");
    }

    static int addition(int num1, int num2){ // wala ng void kasi may nirereturn na
        return num1 + num2;
    }

    static int subtract(int num1, int num2){
        return num1 - num2;
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }

    static int divide(int num1, int num2){
        return num1 / num2;
    }

    static int modulus(int num1, int num2){
        int  quotient = divide(num1, num2);
        int remainder = num1 % num2;

        //check if there's a remainder 
        if(remainder == 0) System.out.println(num1 + " divides evenly by " + num2 + " (no remainder)");
        else System.out.println(num1  + " / " + num2 + " has a remainder: " + remainder);

        //check if EVEN | ODD
        if(remainder % 2 == 0) System.out.println("The quotient (" + quotient + ") is EVEN. ");
        else System.out.println("The quotient ( " + quotient + ") is ODD.");


        //eto yung need ma result sa method nato which is remainder irereturn
        return remainder;
    }

    static boolean isLegalAge( int age){
        if(age >= 18) return true;
        else return false;
    }

    static int add2(int num1, int num2){
        return num1 + num2;
    }

    static int add3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    static double add3(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

}   
