package Inheritance;

/*
    Student - 
 */

    //Student name =    new Student(studNum, name, course, yearLevel);
public class Student {

    private String studNum;
    private String name;
    private String course;
    private String yearLevel;
    


    //new Student(studNum, name, course, yearLevel);
    public Student(String studNum, String name, String course, String yearLevel){
        this.studNum = studNum;
        this.name = name;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    //CREATE GETTER (encapsulation)  to indirectly access yung studnum ng reg student nayun
    public String getStudNum(){
        return this.studNum;
    }

    public String getName(){
        return this.name;
    }

    public String getCourse(){
        return this.course;
    }

    public String getYearLevel(){
        return this.yearLevel;
    }

    public void updateCourse(String course){
        this.course = course;
    }

    public void updateYearLevel(String yearLevel){
        this.yearLevel = yearLevel;
    }

    @Override 
    public String toString() {
        return "\n===== STUDENT INFORMATION ====="
            + "\nStudent Number: " + this.studNum
            + "\nStudent Name  : " + this.name
            + "\nCourse        : " + this.course
            + "\nYear Level  : " + this.yearLevel;

    }

}
