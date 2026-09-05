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
            System.out.print("How many students     : ");
            studCount = scan.nextInt();
            scan.nextLine();
        }

        for(int i = 0; i < studCount; i++ ){
            System.out.println("===== STUDENT " + (i+1) + " =====");
            System.out.print("Enter student name       :  " );
            String studName = scan.nextLine();

            System.out.print("Enter number of subjects :  ");
            int subCount = scan.nextInt();scan.nextLine();
            System.out.println();

            while(subCount <= 0){
                System.out.println("Invalid number of subjects! Try again.");
                System.out.print("Enter number of subjects: ");
                subCount = scan.nextInt();
                scan.nextLine();
            }

            double totalGrade = 0;
            String[] subjectNames = new String[subCount];
            double[] grades = new double[subCount];

            for(int j = 0; j < subCount; j++ ){
                System.out.print("Enter subject " + (j + 1) + " name: ");
                String subName = scan.nextLine();
                subjectNames[j] = subName;

                double subGrade;
                do {
                    System.out.print("Enter " + subName + " grade: ");
                    subGrade = scan.nextDouble();
                    if (Double.isNaN(subGrade) || subGrade < 0 || subGrade > 100) {
                        System.out.println("Invalid grade! Enter a value from 0 to 100.");
                    }
                } while(Double.isNaN(subGrade) || subGrade < 0 || subGrade > 100);
                scan.nextLine();

                totalGrade += subGrade;
                grades[j] = subGrade;
            }

            double averageGrade = totalGrade / subCount;
            String result;

            if (averageGrade < 0 || averageGrade > 100 || Double.isNaN(averageGrade)) {
                result = "Invalid";
            } else if (averageGrade < 75) {
                result = "Failed";
            } else if (averageGrade < 90) {
                result = "Passed";
            } else if (averageGrade < 95) {
                result = "With Honors";
            } else if (averageGrade < 98) {
                result = "High Honors";
            } else {
                result = "Highest Honors";
            }

            System.out.println("\n=====" + studName +  "'s GRADE RESULTS  =====");
            for (int j = 0; j < subCount; j++) {
                System.out.printf("%s: %.2f%n", subjectNames[j], grades[j]);
            }
            System.out.printf("Average: %.2f%n", averageGrade);
            System.out.println("Status: " + result);
        }

        scan.close();
    }
}
