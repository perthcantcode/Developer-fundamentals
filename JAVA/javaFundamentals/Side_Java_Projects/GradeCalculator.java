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

        System.out.println("===== COLLEGE GRADE CALCULATOR =====");
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
                    if (!isValidCollegeGrade(subGrade)) {
                        System.out.println("Invalid grade! Use 1.00, 1.25, 1.50 ... up to 5.00.");
                    }
                } while(!isValidCollegeGrade(subGrade));
                scan.nextLine();

                totalGrade += subGrade;
                grades[j] = subGrade;
            }

            double averageGrade = totalGrade / subCount;
            String result;

            if (Double.isNaN(averageGrade) || averageGrade < 1.00 || averageGrade > 5.00) {
                result = "Invalid";
            } else if (averageGrade <= 1.25) {
                result = "Summa Cum Laude";
            } else if (averageGrade <= 1.75) {
                result = "Magna Cum Laude";
            } else if (averageGrade <= 2.25) {
                result = "Cum Laude";
            } else if (averageGrade <= 3.00) {
                result = "Passed";
            } else {
                result = "Failed";
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

    private static boolean isValidCollegeGrade(double grade) {
        if (Double.isNaN(grade) || grade < 1.00 || grade > 5.00) {
            return false;
        }

        double quarterStep = (grade - 1.00) * 4;
        return Math.abs(quarterStep - Math.round(quarterStep)) < 0.000001;
    }
}
