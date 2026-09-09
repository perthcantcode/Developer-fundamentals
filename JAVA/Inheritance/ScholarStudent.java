package Inheritance;

public class ScholarStudent extends RegularStudent {

    //need may maintaining grade
    private int maintainGrade = 85;

    private String scholarName;

    public ScholarStudent(String studNum, String name, String course, String yearLevel, Task task, String scholarName) {
        super(studNum, name, course, yearLevel, task); // dapat match argument neto sa RegularStudent class unless i add mismo new  var
        this.scholarName = scholarName;
    }

    public void checkMaintainGrade(int grade){
        if(this.maintainGrade >= 85) System.out.println("You are a scholar student");
        else System.out.println("You are not a scholar student");
    } 

    @Override
    public String toString(){
        return "\n===== SCHOLAR STUDENT INFORMATION ====="
            +"\n Student Number: " + super.getStudNum()
            + "\n Student Name: " + super.getName()
            +"\n Course: " + super.getCourse()
            +"\n Year Level: " + super.getYearLevel() + "\n"
            + super.getTask().toString();
    }

}
