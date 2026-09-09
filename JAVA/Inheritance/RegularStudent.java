package Inheritance;


//                                            extends
public class RegularStudent  extends Student{

    private Task task;

    public RegularStudent(String studNum, String name, String course, String yearLevel, Task task) {
        super(studNum, name, course, yearLevel);
        this.task = task;
    }


    //method na for reg students only
    public void updateTask(Task task){
        this.task = task;
    }

    public Task getTask(){
        return this.task;
    }


    @Override
    public String toString(){
        return "\n===== REGULAR STUDENT INFORMATION ====="
            +"\n Student Number: " + super.getStudNum()
            + "\n Student Name: " + super.getName()
            +"\n Course: " + super.getCourse()
            +"\n Year Level: " + super.getYearLevel() + "\n"
            + task.toString();
    }

}
