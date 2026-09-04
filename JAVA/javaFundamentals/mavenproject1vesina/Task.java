package javaFundamentals.mavenproject1vesina;


public class Task {
        
    private String TaskID;
    private String TaskName;
    private String TaskDescription;
    private String Specialization;
    
    public Task (String TaskID, String TaskName, String TaskDescription, String Specialization){
        this.TaskID = TaskID;
        this.TaskName = TaskName;
        this.TaskDescription = TaskDescription;
        this.Specialization = Specialization;
        
    }
    
    public String getTaskID(){
        return this.TaskID;
    }
    
    public String getSpecialization(){
        return this.Specialization;
    }
    
    public void printTask(){
        System.out.println("Task ID: " + this.TaskID);
        System.out.println("Task Name: " + this.TaskName);
        System.out.println("Task Description: " + this.TaskDescription);
        System.out.println("Task Specialization: " +  this.Specialization);
        System.out.println();
    } 
}
