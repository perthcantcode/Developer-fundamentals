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

        //Using the variables
        System.out.print("Hello " + name + " you are " + age + " years old");

        //Conditionals (if-else)

        if(age<=18){System.out.println("You are a minor");}
        else{System.out.println("You are an adult");}
    }

    //Loops (for loops)
    System.out.println("Coounting down from " + age + " to 1 :");

}