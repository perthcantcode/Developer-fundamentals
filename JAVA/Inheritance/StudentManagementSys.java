package Inheritance;

/*
    Problem: Develop a simple Student Management System to help 
    manage information about students and their academic status

    CLASSES:
    1. Student Class -> it has common students attributes and functions
    2. Regular Student Class -> It inherits from the student class and now has a curriculum to follow
    3. Irregular Student Class -> It inherits from the student class but has a limited courses to follow in a curriculum
    4. Scholar Stusdent Class -> it inherits from the students class and also have a required  minimum grade to maintain

 */

public class StudentManagementSys {
    public static void main (String[] args){

        /*

            */

        String studNum = "251011645";
        String name = "Ruperth";
        String course = "BSCS'";
        String yearLevel = "2nd Year";

        Student s1 =   new Student (studNum, name, course, yearLevel);

        System.out.println(s1);
        s1.toString();
        // OUTPUT: Inheritance.Student@251a69d7
        //It gives the string of the whole project or object

        


    }

}
