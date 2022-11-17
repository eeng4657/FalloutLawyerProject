import java.util.Scanner;
import java.io.IOException;

public class LawyerRunner
{
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
        int pointsLeft = 35;

        System.out.print("Enter SPECIAL stats (" + pointsLeft + " SPECIAL points available, each stat has a maximum value of ten)\nEnter your strength stat: ");
        int strength = s.nextInt();
        clear();
        pointsLeft -= strength;
        System.out.print(pointsLeft + " points left.\nEnter your perception stat: ");
        int perception = p.nextInt();
        clear();
        //clear works in vscode, use powershell as backup
        pointsLeft -= perception;
        System.out.print(pointsLeft + " points left.\nEnter your endurance stat: ");
        int endurance = e.nextInt();
        clear();
        pointsLeft -= endurance;
        System.out.print(pointsLeft + " points left.\nEnter your charisma stat: ");
        int charisma = c.nextInt();
        clear();
        pointsLeft -= charisma;
        System.out.print(pointsLeft + " points left.\nEnter your intelligence stat: ");
        int intelligence = i.nextInt();
        clear();
        pointsLeft -= intelligence;
        System.out.print(pointsLeft + " points left.\nEnter your agility stat: ");
        int agility = a.nextInt();
        clear();
        pointsLeft -= agility;
        System.out.print(pointsLeft + " points left.\nEnter your luck stat: ");
        int luck = l.nextInt();
        clear();
        pointsLeft -= luck;
        //places each SPECIAL stat into an integer variable

        System.out.println("\nName: " + house.lawyerName(name));
        System.out.println(house.statChoice(strength,perception,endurance,charisma,intelligence,agility,luck));
        System.out.print(house.caseDetail);
    }

    public static void clear() 
    {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}

    }
    //move this to its own class or FalloutLawyer.java
}