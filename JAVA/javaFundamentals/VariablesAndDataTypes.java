package javaFundamentals;

public class VariablesAndDataTypes {
     public static void main(String[] args) {
    
        char sec = 'A';
        String name ="Ruperth";
        boolean isHandsome = false;
        int num = 28;
        //float grade = 99.9f; //need f sa dulo para maindicate
        //double grade1 = 93.25f; // yung float pwede maging double pero yung double bawal maging float

        //Reassigning variable syntax
        //Don't forget semi colon very crucial (;)

        name = "Ruperth Jay";
        isHandsome = true;
        num = 29;

        System.out.println(name);
        System.out.println(isHandsome);
        System.out.println(num);


        //Concatenation
        System.out.println("I am " + name + " from section " + sec);

        //Challenge #1 Sentence builder 
        String Alias = "Kwan";
        int edad = 19;
        float gpa = 1.75f;
        char bt = 'O';

        System.out.println("Hi my name is " +  Alias);
        System.out.println("I am " + edad + " years old");
        System.out.println("My GPA is " + gpa);
        System.out.println("My blood type is " + bt);
        //System.out.print()

        
    }
}
