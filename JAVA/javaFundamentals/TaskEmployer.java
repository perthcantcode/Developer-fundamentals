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
            String raw = inpt.nextLine().trim();
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

    for( int i = 0;  i < numEmployees;  i++){
        System.out.println("Enter name of employee " + (i + 1) + ": ");
        employeeNames[i] = inpt.nextLine().trim();

        String chosenTask = null;
        while(chosenTask == null) {
            System.out.println("Assign a task to " + employeeNames[i]
            + "(must match one from the list above): ") ;
            String input = inpt.nextLine().trim();
            chosenTask = findTasks(tasks, input);
            if(chosenTask == null){
                System.out.println("Invalid Task. Please choose one from the predefined list.");
            }
        }
        assignedTasks[i] = chosenTask;
    }


}
