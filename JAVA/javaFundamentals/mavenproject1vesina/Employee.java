package javaFundamentals.mavenproject1vesina;

public class Employee {
    
    private String EmployeeId;
    private String EmployeeName;
    private String Department;
    private String Position;
    private Task AssignedTask;
    
    public Employee (String EmployeeId, String EmployeeName, String Department, String Position){
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Department = Department;
        this.Position = Position;
    }
    
    public  String getEmployeeID(){
        return this.EmployeeId;
    }
    
    public void assignTask(Task task){
        System.out.println("===== ASSIGNING TASK TO "  + this.EmployeeName + " =====");
        //prac na dapat una error handling sa if else
        if(this.AssignedTask != null){
            System.out.println("Failed to add task! User already had a task.\n");
            return;
        }
        
        String[] positionWords = this.Position.toLowerCase().split(" ");
        String specialization = task.getSpecialization().toLowerCase();

        boolean isMatch = false;
        for(String word : positionWords){
            if(word.length() >=2 && specialization.contains(word)){
                isMatch = true;
                break;
            }
        }
        
        if(!isMatch){
            System.out.println("Failed to add task ! "
                + "Position ("+ this.Position.toLowerCase() + ") doesnt match "
                + "the required Specialization (" + task.getSpecialization() + " ).");
            return;
        }
        
        this.AssignedTask = task; //save the task
        System.out.println("Succesfully Added Task!\n");
    }
    
    public String getPosition(){
            return this.Position;
    }
    
   //getter to so dapat walang parameters and use the Task class name
   //so andito updated naka store assigned task for employee
    public Task getTask(){
        return this.AssignedTask;
    }
    
    public void printEmployees(){
        System.out.println("Employee ID: " + this.EmployeeId);
        System.out.println("Employee Name: " + this.EmployeeName);
        System.out.println("Department: " + this.Department);
        System.out.println("Position: " + this.Position);
        System.out.println("===== CURRENT TASK =====");
        if(this.AssignedTask != null){
            this.AssignedTask.printTask();
        }else{
            System.out.println("Currently no Task\n");
        }
    }

}