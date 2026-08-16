import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Scanner reads input typed by the user in the Terminal
        Scanner scanner = new Scanner(System.in);
        
        //Variables diff data types
        String name;
        int age;

        //Getting input from the user
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //Using the variables
        System.out.print("Hello " + name + " you are " + age + " years old \n");

        //Conditionals (if-else)

        if(age<=18){System.out.println("You are a minor");}
        else{System.out.println("You are an adult");}

    //Loops (for loops)
    System.out.println("Counting down from " + age + " to 1 : ");
    for(int i=age;  i>= 1; i--){
        System.out.print(i);
    }

    System.out.println(); // just moves to a new line after the loop

     // Repeats WHILE a condition is true, checked before each run
    int count = 1;
    System.out.print("Counting up to 5 using a while loop: ");
    while(count <= 5){
        System.out.print(count);
        count++;
    }

    //DATA TYPES\
    //Java is statically typed which is every variable must declare its own type 
    //and that type  never changes.
    int wholeNum = 10;
    double decimalNum = 10.15;
    char letter = 'R';
    boolean isJavaFun = true;
    String text = "Hello Lord";

    System.out.println("=== Data Types ===");
    System.out.println("Int: " + wholeNum);
    System.out.println("char: " + letter);
    System.out.println("boolean: " + isJavaFun);
    System.out.println("String: " + text);
    System.out.println();

     // ================================================================
        // 2. ARITHMETIC OPERATORS
        // ================================================================
        // + - * / are what you'd expect. % is "modulo" — the REMAINDER
        // after division. Very useful for checking even/odd, cycles, etc.
        int a = 17, b = 5;

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("a + b = " + (a + b)); // 22
        System.out.println("a - b = " + (a - b)); // 12
        System.out.println("a * b = " + (a * b)); // 85
        System.out.println("a / b = " + (a / b)); // 3  <-- int / int = int (truncates!)
        System.out.println("a % b = " + (a % b)); // 2  <-- remainder


        // Important gotcha: dividing two ints drops the decimal part.
        // To get a precise decimal result, at least one number must be a double.
        double preciseDivision = (double) a / b; // (double) "casts" a to a decimal
        System.out.println("Precise a / b = " + preciseDivision); // 3.4
        System.out.println();

        // ================================================================
        // 3. FORMATTING NUMBERS (two decimal places, spacing)
        // ================================================================
        // printf lets you control exactly how output looks.
        // %.2f  = format as a decimal (f) with exactly 2 digits after the point
        // %5d   = format as an integer (d), padded to take up 5 characters wide
        // \n    = newline (printf doesn't auto-add one like println does)
        System.out.println("=== FORMATTING ===");
        System.out.printf("Two decimal places: %.2f%n", preciseDivision); // 3.40
        System.out.printf("Padded number: [%5d]%n", 42);   // [   42]
        System.out.printf("Left-aligned:  [%-5d]%n", 42);  // [42   ]
        System.out.printf("%s is %d years old and %.1f meters tall.%n", "Alex", 20, 1.75);
        System.out.println();

        
    scanner.close();
    // main() closes here — everything is inside it
    }
}