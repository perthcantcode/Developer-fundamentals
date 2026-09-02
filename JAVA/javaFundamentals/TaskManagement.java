package javaFundamentals;

public class TaskManagement {
    public static void main(String[] args) {
        
        System.out.println("===== TASK MANAGEMENT PROGRAM ======\n");
        String[] Gawain = {"Saing", "Hugas","Laba","Walis","Luto"};
        printGawain(Gawain);
    }
    static void printGawain(String[] Gawain){
        for(int i = 0; i <= Gawain.length-1; i++) {
            System.out.println((i + 1) + ".)  " + Gawain[i]);
        }
    }
    
}
