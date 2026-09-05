package javaFundamentals.Side_Java_Projects;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        //Build a simple student grade calculator 

        /*
        so first lets break it down into smaller and manageable parts
        ->Get number of students
        ->Get name of students
        -> Get number of subjects
        -> Get grades for each subjects
        -> Calculate the average grade for each student
        -> Identify if passed or failed based on avg
        -> Display results

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");
        System.out.print("How many students: ");
        int studCount = scan.nextInt();
        scan.nextLine();

        while(studCount <= 0){
            System.out.println("Invalid number of students! ");
            System.out.print("How many students: ");
            studCount = scan.nextInt();
            scan.nextLine();
        }

        for(int i = 0; i < studCount; i++ ){
            System.out.print("Enter name of student " + (i+1)+  ".) " );
            String studName = scan.nextLine();

            System.out.print("Enter number of subjects for " + studName + ":");
            int subCount = scan.nextInt();
            scan.nextLine();

            if(subCount <= 0){
                System.out.println("Invalid number of subjects ! Try Again.");
                System.out.print("Enter number of subjects for " + studName + ": ");
                subCount = scan.nextInt();
                scan.nextLine();
            }else{
                for(int j = 0; j <  subCount; j++ ){
                    System.out.print("Enter  subject " + (j+1) + " name: ") ;
                    String subName = scan.nextLine();

                    System.out.print("Enter subject grade: ");
                    Double subGrade = scan.nextDouble(); scan.nextLine();

                    if(subGrade < 0 || subGrade > 100){
                        System.out.println("Invalid grade! Must be between 0 and 100.");
                        System.out.print("Enter subject grade: ");
                        subGrade = scan.nextDouble();
                    }
                }

                
            }

        }
        
        
    

    }
}
