package javaFundamentals;
import java.util.Scanner;
public class TaskManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== TASK MANAGEMENT PROGRAM ======\n");
        String[] Gawain = {"Saing", "Hugas","Laba","Walis","Luto"};
        printGawain(Gawain);


    }

    static void printGawain(String[] Gawain){
        for(int i = 0; i <= Gawain.length-1; i++) {
            System.out.println((i + 1) + ".)  " + Gawain[i]);
        }
    }
    

    static void findGawain( String[] Gawain, String gawain){
        for(String g: Gawain){
            if(g.equalsIgnoreCase(gawain){
                return true;
            })
        }
    }

    public static void ManageGawain(Scanner input, String[] Gawain){
        int numMember = 0;

        while(numMember <= 0){
            System.out.println("Enter number of members: ");
            numMember = Integer.parseInt(input.nextLine().trim());
            if(numMember <= 0){
                System.out.println("Enter a non negative number (Try Again): ");
            }
        }

        String[] memberNames = new String[numMember];
        String[] assignedGawain = new String[numMember];

        for(int i = 0; i < numMember; i++){
            System.out.println("Enter name of member " + (i + 1) + "  : ")
            memberNames[i] = input.nextLine().trim();

            String napilingGawain = "";
            boolean isLegit = false;

            while(isLegit){
                System.out.println(("Magutos ng gawain to " + memberNames[i] + " (chose a gawain from the task list above"));
                napilingGawain = input.nextLine().trim();
                isLegit = findGawain(Gawain, napilingGawain);
                if(!isLegit){
                    System.out.println("Invalid Task, Choose again");
                }
            }

            for(String t: Gawain){
                if(t.equalsIgnoreCase(napilingGawain)){
                    napilingGawain = t;
                    return;
                }
            }

            assignedGawain[i] = napilingGawain;

            System.out.println("===== MEMBERS TASK ASSIGNMENTS =====");
            for(int i = 0; i < numMember; i++){
                System.out.println(numMember[i] + " ay inuutsan na "+ assignedGawain[i]);
            }

        }
    }
}

