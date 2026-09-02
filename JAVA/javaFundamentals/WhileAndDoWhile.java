package javaFundamentals;
import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(i <= 5){
            System.out.print(i);
            i++;
        }
        System.out.println();

        String names[] = {"Rossy","Randolf","Rickleen","Ruperth","Ruth"};
        int index = 0;

        while(index < 5){
            System.out.print(names[index] + ", ");
            index++;
        }

        scan.close();
    }
}
