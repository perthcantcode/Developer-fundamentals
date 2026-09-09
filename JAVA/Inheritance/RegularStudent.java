package Inheritance;


//                                            extends
public class RegularStudent  extends Student{

    private Task task;

    public RegularStudent(String studNum, String name, String course, String yearLevel) {
        super(studNum, name, course, yearLevel);
        this.task = task;
    }

    @Override
    public String toString(){
        return "\n===== REGULAR STUDENT INFORMATION ====="
            +"\n Student Number: " + super.getStudNum()
            + "\n Student Name: " + this.getName()
            +"\n Course: " + this.getCourse()
            +"\n Year Level: " + this.getYearLevel()
            +"\n Task: " + this.task;

    }

}
