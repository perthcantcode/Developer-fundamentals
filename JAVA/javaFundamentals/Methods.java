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

}
