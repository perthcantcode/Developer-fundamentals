package javaFundamentals;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //Arrays = elements or values laman nun
        // Declare w/ values
        String studentName[] = {"Kwan","Perth","Erich", "Ruperth", "Vesina"};
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        //Declare w/o values
        //Once dineclare size ng array dina pwede palitan, baguhin, dagdagan or bawasan

        String employeeNames[] = new String[5];
        employeeNames[0] = "Kwan";
        employeeNames[1] = "Perth";
        employeeNames[2] = "Erich";
        employeeNames[3] = "Ruperth";
        employeeNames[4] = "Vesina";
        int evenNum[] = new int[10];

        // //how to read and write or ACCESS the arrays (0-...n-1)
        //0 starting point and n-1 end point
        //Index - number that represents a position in a collection

        System.out.println(studentName[1]);
        System.out.println(numbers[2] +numbers[5]);

        //Write value on specific element
        studentName[2] = "Pits";
        System.out.println(studentName[2]); // pinalitan yung index nung "Perth" na name


        //with user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeNames[0] = s.nextLine();
        System.out.println(employeeNames[0]);

        //Challenge 3: Paired Arrays By Index
        //int index[] = {0,1,2};
        String email[] = {"ruperthayvesina1323@gmail.com", "m1lixxstratos@gmail.com", "pepitomanaloto453@gmail.com"};
        String usern[] = {"kwan", "kratos","pits"};
        String passw[] = {"blk13Lot23", "PoGIIaKU123:)","P3ng3H@td0g"};

        int index = 2; // sya na mag aaccess sa index ng lahat if generalize ang pag access ng Arrays

        System.out.println("Index    : " + index );
        System.out.println("Email    : " + email[index]);
        System.out.println("Username : " + usern[index]);
        System.out.println("Password : " + passw[index]);
        
    }
}
