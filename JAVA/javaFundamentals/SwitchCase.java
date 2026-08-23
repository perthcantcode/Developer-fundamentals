package javaFundamentals;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char grade = 'A';

        switch(grade){
            case 'A' :
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Satisfaction");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
