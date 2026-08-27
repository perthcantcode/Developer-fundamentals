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
        int numEmployees = -1;

        while(numEmployees < 0){
            System.out.println("Enter number of employees: ");
            String raw = input.nextLine().trim();
            try {
                numEmployees = Integer.parseInt(raw);
                if (numEmployees < 0){
                    System.out.println("Please enter a non-negative number.");
                }
            }catch(NumberFormatException e){
                System.out.println("That's not a valid number. Please try again !");
            }
        }
    }

    String[] employeeNames = new String[numEmployees];
    String[] assignedTasks = new String[numEmployees];

    


}
