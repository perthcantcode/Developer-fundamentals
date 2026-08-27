package javaFundamentals;
import java.util.Scanner;
public class TaskEmployer {
    public static void main(String[] args) {
        System.out.println("=== Company Task List ===");



    }

    public static String findTasks(String[] tasks, String task){
        for (String t : tasks){
            if(t.equalsIgnoreCase(task)){
                return t;
            }
        }
        return null;
    }

}
