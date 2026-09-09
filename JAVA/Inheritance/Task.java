package Inheritance;

public class Task {

    private String taskName;
    private String taskDesc;

    public Task(String taskName, String taskDesc) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
    }

    public String getTaskName(){
        return this.taskName;
    }

    @Override 
    public String toString(){
        return "\n ===== TASK DESCRIPTION ====="
            + "\n Task Name: " + this.taskName
            + "\n Task Description: " + this.taskDesc;
    }
}
