package javaFundamentals;
import java.util.Scanner;
public class TaskEmployerManagement {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Laboratory #1: Methods in Java");
        System.out.println("(Task and Employee Management)");
        String[] Tasks = {
            "Database Maintenance","Prepare Monthly Report","Start a Meeting","Update Inventory System","Access Database"};
        displayTasks(Tasks);
        manageEmployees(inpt, Tasks);
        inpt.close();
    }
    /* First Mwthod: Displays predefined companys tasks list using for loop and only
    returns the array of tasks in numbered and arranged form.
     */
    public static void displayTasks(String[] Tasks){
        System.out.println("\n===== Company's Task List ===+=");
        for(int i = 0; i <= Tasks.length-1 ; i++){
            System.out.println((i +1) + ".) " + Tasks[i]);
        }
    }

    /*2nd Method: searches and check if task exists in the company task lists arrays 
    and returns true if it exists in case-insensitive form and false if otherwise. also i used
    boolean returning search function instead na maghanap and magreturn ng actual string that can acause null issues
     */
    public static boolean findTasks(String[] Tasks, String task){
        for(String t : Tasks){
            if(t.equalsIgnoreCase(task)){
                return true;
            }
        }
        return false;
    }
    
    /*3rd Method:  it asks how many employees and  asks until its valid 
    then collect theire names  and store each name on an array employeeNames[]
    and after that it reuses the 2nd Method or the findTask method to find if the assigned task is valid
    on the nested while loop/.

    then lastly is using nested for each loop to normalize the output kasi  yung findTask method is boolean
    and nirereturn nya lang is either true or false so actual text or raw input parin yung return even if na validated na
    yung input, so it overwrites the chosenTask  using that.
         */
    public static void manageEmployees(Scanner inpt, String[] Tasks ){
        int numEmployee = 0;

        while(numEmployee <= 0 ){
            System.out.print("\nEnter number of employees: ");
            numEmployee = Integer.parseInt(inpt.nextLine().trim());
            if(numEmployee <= 0){
                System.out.println("Please enter a number greater than zero! ");
            }
        }

        String[] employeeNames = new String[numEmployee];
        String[] assignedTasks = new String[numEmployee];

        for(int i = 0; i < numEmployee;  i++){
            System.out.print("Enter name of employee " + (i+1)+ ": ");
            employeeNames[i] = inpt.nextLine().trim();

            String chosenTask = "";
            boolean isValid = false;

            while(!isValid){
                System.out.print("Assign a task to " + employeeNames[i] + " (chose one one the Company's task list above):  ");
                chosenTask = inpt.nextLine().trim();
                isValid = findTasks(Tasks, chosenTask);
                if(!isValid){
                    System.out.println("Invalid task! Please choose one on the Company's task list.");
                }
            }

            for(String t : Tasks){
                if(t.equalsIgnoreCase(chosenTask)){
                    chosenTask = t;
                    break;
                }
            }

            assignedTasks[i] = chosenTask;
        }

        System.out.println("\n===== EMPLOYEE TASK ASSIGNMENTS =====");
        for(int i = 0; i < numEmployee; i ++){
            System.out.println(employeeNames[i] + " task is: " + assignedTasks[i]);

        }
    }
}
