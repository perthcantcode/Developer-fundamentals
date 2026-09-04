package javaFundamentals;
import java.util.Scanner;
public class TaskManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== TASK MANAGEMENT PROGRAM ======\n");
        String[] Gawain = {"Saing", "Hugas","Laba","Walis","Luto"};
        printGawain(Gawain);
        ManageGawain(input, Gawain);

        input.close();

    }

    static void printGawain(String[] Gawain){
        for(int i = 0; i <= Gawain.length-1; i++) {
            System.out.println((i + 1) + ".)  " + Gawain[i]);
        }
    }
    

    public static boolean findGawain( String[] Gawain, String gawain){
        for(String g : Gawain){
            if(g.equalsIgnoreCase(gawain)){
                return true;
            }
        }
        return false;
    }

    public static void ManageGawain(Scanner input, String[] Gawain){
        int numMember = 0;

        while(numMember <= 0){
            System.out.print("Enter number of members: ");
            numMember = Integer.parseInt(input.nextLine().trim());
            if(numMember <= 0){
                System.out.println("Enter a non negative number (Try Again) ");
            }
        }

        String[] memberNames = new String[numMember];
        String[] assignedGawain = new String[numMember];

        for(int i = 0; i < numMember; i++){
            System.out.print("Enter name of member " + (i + 1) + "  : ");
            memberNames[i] = input.nextLine().trim();

            String napilingGawain = "";
            boolean isLegit = false;

            while(!isLegit){
                System.out.print(("Magutos ng gawain to " + memberNames[i] + " (chose a gawain from the task list above): "));
                napilingGawain = input.nextLine().trim();
                isLegit = findGawain(Gawain, napilingGawain);
                if(!isLegit){
                    System.out.println("Invalid Task, Choose again");
                }
            }

            for(String t: Gawain){
                if(t.equalsIgnoreCase(napilingGawain)){
                    napilingGawain = t;
                    break;
                }
            }

            assignedGawain[i] = napilingGawain;
        }

        System.out.println("===== MEMBERS TASK ASSIGNMENTS =====");
        for(int i = 0; i < numMember; i++){
            System.out.println(memberNames[i] + " ay inuutsan na mag "+ assignedGawain[i]);
        }

    }
}

