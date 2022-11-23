import java.util.Scanner;
import java.io.IOException;

public class LawyerRunner
{
    public static void clear() 
    {
        try 
        {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } 
        catch (IOException | InterruptedException ex) {}
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
        while(strength > 10)
        {
            strength = 1;
            System.out.print("Your strength stat exceeds the limit of ten. Please reenter the stat: ");
            userS = s.nextInt();
            strength += userS;
        }
        clear();
        pointsLeft -= userS;

        System.out.print(pointsLeft + " points left.\nEnter your perception stat: ");
        int perception = 1;
        int userP = p.nextInt();
        perception += userP;
        while(perception > 10)
        {
            perception = 1;
            System.out.print("Your perception stat exceeds the limit of ten. Please reenter the stat: ");
            userP = p.nextInt();
            perception += userP;
        }
        clear();
        pointsLeft -= userP;

        System.out.print(pointsLeft + " points left.\nEnter your endurance stat: ");
        int endurance = 1;
        int userE = e.nextInt();
        endurance += userE;
        while(endurance > 10 || pointsLeft < 0)
        {
            endurance = 1;
            System.out.print("Your endurance stat exceeds the limit of ten and/or you are exceeding the given number of SPECIAL points. Please reenter the stat: ");
            userE = e.nextInt();
            endurance += userE;
        }
        clear();
        pointsLeft -= userE;

        System.out.print(pointsLeft + " points left.\nEnter your charisma stat: ");
        int charisma = 1;
        int userC = c.nextInt();
        charisma += userC;
        while(charisma > 10 || pointsLeft < 0)
        {
            charisma = 1;
            System.out.print("Your charisma stat exceeds the limit of ten and/or you are exceeding the given number of SPECIAL points. Please reenter the stat: ");
            userC = c.nextInt();
            charisma += userC;
        }
        clear();
        pointsLeft -= userC;

        System.out.print(pointsLeft + " points left.\nEnter your intelligence stat: ");
        int intelligence = 1;
        int userI = i.nextInt();
        intelligence += userI;
        while(intelligence > 10 || pointsLeft < 0)
        {
            intelligence = 1;
            System.out.print("Your intelligence stat exceeds the limit of ten and/or you are exceeding the given number of SPECIAL points. Please reenter the stat: ");
            userI = i.nextInt();
            intelligence += userI;
        }
        clear();
        pointsLeft -= userI;

        System.out.print(pointsLeft + " points left.\nEnter your agility stat: ");
        int agility = 1;
        int userA = a.nextInt();
        agility += userA;
        while(agility > 10 || pointsLeft < 0)
        {
            agility = 1;
            System.out.print("Your agility stat exceeds the limit of ten and/or you are exceeding the given number of SPECIAL points. Please reenter the stat: ");
            userA = a.nextInt();
            agility += userA;
        }
        clear();
        pointsLeft -= userA;

        System.out.print(pointsLeft + " points left.\nEnter your luck stat: ");
        int luck = 1;
        int userL = l.nextInt();
        luck += userL;
        while(luck > 10 || pointsLeft < 0)
        {
            luck = 1;
            System.out.print("Your luck stat exceeds the limit of ten and/or you are exceeding the given number of SPECIAL points. Please reenter the stat: ");
            userL = l.nextInt();
            luck += userL;
        }
        clear();
        pointsLeft -= userL;
        //places each SPECIAL stat into an integer variable
        //clear works in vscode, use powershell as backup
        //put each stat selection in a loop to check if it is exceeding ten, make statChoice method only check if count exceeds 27

        System.out.println("\nName: " + house.lawyerName(name));
        System.out.println(house.statChoice(strength,perception,endurance,charisma,intelligence,agility,luck));
        System.out.print(house.caseDetail);

        if(house.riggedFromTheStart(luck).equals(""))
        {
            System.out.print(house.caseResult(strength,perception,endurance,charisma,intelligence,agility,luck));
        }
        else
        {
            System.out.print(house.riggedFromTheStart(luck));
        }
    }
}