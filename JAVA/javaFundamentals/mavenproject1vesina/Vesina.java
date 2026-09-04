package javaFundamentals.mavenproject1vesina;

import java.util.ArrayList;
import java.util.Scanner;


public class Vesina {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Task> tasks = new ArrayList<>();
        
        employees.add(new Employee("E001", "Ruperth", "CEIT", "Frontend"));
        employees.add(new Employee("E002", "Bryce", "CEIT", "API"));
        employees.add(new Employee("E003", "Jhanzen", "CEIT", "Database"));
        employees.add(new Employee("E004", "Louigie", "CEIT", "Programmer"));
        employees.add(new Employee("E005", "Louise", "CEIT", "Maintenance"));
        employees.add(new Employee("E006", "Sam", "CEIT", "Lead"));
        
        tasks.add(new Task (
                "T001",
                "Database Maintenance",
                "Check, Access and Maintain DB",
                " Database Officer"
        ));
        tasks.add(new Task (
                "T002",
                "API Integration",
                "Create Clean REST API's",
                " API Lead"
        ));
        tasks.add(new Task (
                "T003",
                "UI & UX Designing",
                "Analyze methodologies for better UI & UX Design",
                "Frontend Programmer"
        ));
  
        
        boolean isRunning = true;
        while(isRunning){
            System.out.println("===== COMPANY MANAGEMENT =====");
            System.out.println(
                    "1. Check Task\n"
                    + "2. Check Employees\n"
                    + "3. Add Task to Employee\n"
                    + "4. Create Task\n"
                    + "5. Exit"
            );
            
            System.out.print("\nEnter Choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1 -> {checkTask(tasks); break;}
                case 2 -> {checkEmployee(employees); break;}
                case 3 -> {addTasktoEmployee(scan, employees, tasks); break;}
                case 4 -> {createTask(scan, tasks); break;}
                case 5 -> {System.out.println("Exited ! "); isRunning = false;}
                default -> {System.out.println("Invalid Input, Try Aagain ! ");}
            }
        }
        
    }
    
    public static void checkTask( ArrayList<Task> tasks){
            System.out.println("===== CURRENT EXISTING TASKS =====\n");
            for (Task t : tasks){
                t.printTask();
            }
    }
    
    public static void checkEmployee(ArrayList<Employee> employees){
        System.out.println("===== CHECK EMPLOYEES ===== ");
        for(Employee e : employees){
            e.printEmployees();
        }
    }
    
    public static void createTask(Scanner scan, ArrayList<Task> tasks){
        System.out.println("===== CREATE TASK =====");
       
        System.out.print("Enter Task ID (T000 Format): ");
        String taskId = scan.nextLine();
        
        System.out.print("Enter Task name: ");
        String taskName = scan.nextLine();
        
        System.out.print("Enter Description: ");
        String taskDesc = scan.nextLine();
        
        System.out.print("Enter Specialization: ");
        String taskSpec = scan.nextLine();
        
        //Initialize ulit Task
        Task task = new Task (taskId, taskName, taskDesc, taskSpec);
       
        tasks.add(task);
        System.out.println("Succesfully added the task !\n");
        task.printTask();
    }
    
    public static void addTasktoEmployee(Scanner scan, ArrayList<Employee> employees, ArrayList<Task> tasks){
        System.out.println("===== ADD TASK TO EMPLOYEES =====");
        
        //Instantiate Employee and Task Object
        Employee selectedEmployee = null;
        Task selectedTask = null;

        while(selectedEmployee == null){
            System.out.print("Find Employee ID: ");
            String employeeId = scan.nextLine();
            
            for(Employee iteratedEmp : employees){
                if(iteratedEmp.getEmployeeID().equalsIgnoreCase(employeeId)){
                    selectedEmployee = iteratedEmp; 
                    break;
                }
            }
            if(selectedEmployee == null){
                System.out.println("Invalid, Employee ID doesnt exist !");
            }
        }
        
        while(selectedTask == null){
            System.out.print("Enter Task ID : ");
            String taskId = scan.nextLine();
            
            for(Task iteratedTask : tasks){
                if(iteratedTask.getTaskID().equalsIgnoreCase(taskId)){
                    selectedTask = iteratedTask;
                    break;
                }
            }
            if(selectedTask != null){
                break;
            }
            System.out.println("Invalid Task ID, Try Again !");
        }
        
        selectedEmployee.assignTask(selectedTask);
    }
    
}
