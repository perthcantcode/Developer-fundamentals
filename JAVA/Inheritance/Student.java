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


}
