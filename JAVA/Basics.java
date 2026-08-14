import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables diff data types
        String name;
        String age;

        //Getting input from the user
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        
        System.out.print("Hello " + name + " you are " + age + " years old");

        //Conditionals

        if(age<=18){System.out.printLn("You are a minor");}
        else{System.out.printLn("You are an adult");}
    }
}