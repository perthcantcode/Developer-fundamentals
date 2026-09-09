package Inheritance;
import java.util.Scanner;
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

        Scanner scan = new Scanner(System.in);

        Task t1 = new Task("DCIT50 ", "Learn OOP");
        Task t2 = new Task("COSC100", "Learn Automata");
        Task t3 = new Task("DCIT23 " ,  "Learn Java Programming");
        Task t4 = new Task("COSC80", "Learn Operating Systems" );

        RegularStudent rs1 = new RegularStudent("S001", "Ruperth", "BSCS", "2nd Year", t1);
        RegularStudent rs2 = new RegularStudent("S002", "Erich", "BSECON", "2nd Year", t2);
        IrregularStudent irs1 = new IrregularStudent("S003", "Macci", "BSIT", "2nd Year", t2);
        ScholarStudent ss1 = new ScholarStudent("S004", "Doflamingming", "BSCATZ", "4th Year", t2, "Mingo");
        
        System.out.println("List of Students:");
        System.out.println(rs2.toString());
        System.out.println(ss1.toString());
        System.out.println(irs1.toString());



        /*
            Task t1 = new Task("DCIT50 Java Programming", "Learn JAVA OOP Inheritance");

        String studNum = "251011645";
        String name = "Ruperth";
        String course = "BSCS'";
        String yearLevel = "2nd Year";

        Student s1 =   new Student (studNum, name, course, yearLevel);
        RegularStudent rs1 = new RegularStudent (studNum, name, course, yearLevel, t1);

        //System.out.println(s1);
        //s1.toString();
        // OUTPUT: Inheritance.Student@251a69d7
        //It gives the string of the whole project or object

          //Parent Class
        System.out.println(s1.toString());

        System.out.println("==========================");
        //Child Class #!
        System.out.println(rs1.toString());
         */
    



    }

}
