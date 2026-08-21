package javaFundamentals;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        // Main - ito lang nagrurun
        Scanner scan = new Scanner(System.in);

        //Call methods sa loob ng Main Method
        sayHello();  // nakabase sino mauuna sa pag call sa main method hindi sa naunang ideclare
        sayHi();
    }

    static void sayHi(){
        System.out.println("Hi");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

}
