import java.util.Scanner;
import java.io.IOException;

public class LawyerRunner
{
    public static void clear() 
    {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}

    }
    
    public static void main(String[] args)
    {
        FalloutLawyer house = new FalloutLawyer();

        Scanner n = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        //scanning for name, all SPECIAL stats, and case choice

        clear();
        System.out.print("Enter name of player: ");
        String name = n.nextLine();
        //places name of lawyer into String variable
        int pointsLeft = 28;

        System.out.print("Enter SPECIAL stats (" + pointsLeft + " SPECIAL points available, each stat has a maximum value of ten)\nEnter your strength stat: ");
        int strength = 1;
        int userS = s.nextInt();
        strength += userS;
        clear();
        pointsLeft -= userS;

        System.out.print(pointsLeft + " points left.\nEnter your perception stat: ");
        int perception = 1;
        int userP = p.nextInt();
        perception += userP;
        clear();
        pointsLeft -= userP;

        System.out.print(pointsLeft + " points left.\nEnter your endurance stat: ");
        int endurance = 1;
        int userE = e.nextInt();
        endurance += userE;
        clear();
        pointsLeft -= userE;

        System.out.print(pointsLeft + " points left.\nEnter your charisma stat: ");
        int charisma = 1;
        int userC = c.nextInt();
        charisma += userC;
        clear();
        pointsLeft -= userC;

        System.out.print(pointsLeft + " points left.\nEnter your intelligence stat: ");
        int intelligence = 1;
        int userI = i.nextInt();
        intelligence += userI;
        clear();
        pointsLeft -= userI;

        System.out.print(pointsLeft + " points left.\nEnter your agility stat: ");
        int agility = 1;
        int userA = a.nextInt();
        agility += userA;
        clear();
        pointsLeft -= userA;

        System.out.print(pointsLeft + " points left.\nEnter your luck stat: ");
        int luck = 1;
        int userL = l.nextInt();
        luck += userL;
        clear();
        pointsLeft -= userL;

        //places each SPECIAL stat into an integer variable
        //clear works in vscode, use powershell as backup
        //put each stat selection in a loop to check if it is exceeding ten, make statChoice method only check if count exceeds 27

        System.out.println("\nName: " + house.lawyerName(name));
        System.out.println(house.statChoice(userS,userP,userE,userC,userI,userA,userL));
        System.out.print(house.caseDetail);
    }
}