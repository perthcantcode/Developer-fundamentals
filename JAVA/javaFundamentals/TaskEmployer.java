package javaFundamentals;
import java.util.Scanner;
public class TaskEmployer {
    public static void main(String[] args) {
        System.out.println("=== Company Task List ===");



    }

    public static String findTasks(String[] tasks, String task){
        for (String t : tasks){
            if(t.equalsIgnoreCase(task)){
                return t;
            }
        }
        return null;
    }

    public static void manageEmployees(Scanner input, String[] tasks){
        int numEmp = -1;

        while(numEmp < 0){
            System.out.println("Enter number of employees: ");
            String raw = input.nextLine().trim();
            try {
                numEmp = Integer.parseInt(raw);
                if (numEmp < 0){
                    System.out.println("Please enter a non-negative number.");
                }
            }catch(NumberFormatException e){
                System.out.println("That's not a valid number. Please try again !");
            }
        }

    }

}
