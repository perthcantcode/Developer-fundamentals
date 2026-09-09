package Inheritance;

public class IrregularStudent extends RegularStudent {

    private  Task LimitTask;

    public IrregularStudent(Strings studNum, String name, String course, String yearLevel, Task task) {
        super(studNum, name, course, yearLevel, task);

    }

    public void LimitTask(Task task){

        Task assignedTask = super.getTask();

        if(super.getTask().getTaskName().contains("COSC")){
            System.out.println("Task is Unavailable for Irregular Students");
            System.out.println("Removing Task: " + super.getTask().getTaskName());
            //super.getTask(); // bawal super.getTask() = null;
            assignedTask = null;
        }

    }

    @Override
    public String toString(){
        return "\n===== IRREGULAR STUDENT INFORMATION ====="
            +"\n Student Number: " + super.getStudNum()
            + "\n Student Name: " + super.getName()
            +"\n Course: " + super.getCourse()
            +"\n Year Level: " + super.getYearLevel() + "\n"
            + super.getTask().toString();
    }
    

}
