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
        Scanner s1 = new Scanner(System.in);

        Scanner p = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);

        Scanner e = new Scanner(System.in);
        Scanner e1 = new Scanner(System.in);
        Scanner e2 = new Scanner(System.in);

        Scanner c = new Scanner(System.in);
        Scanner c1 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);

        Scanner i = new Scanner(System.in);
        Scanner i1 = new Scanner(System.in);
        Scanner i2 = new Scanner(System.in);

        Scanner a = new Scanner(System.in);
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);

        Scanner l = new Scanner(System.in);
        Scanner l1 = new Scanner(System.in);
        Scanner l2 = new Scanner(System.in);
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
        while(strength > 10)
        {
            System.out.print("Your strength stat exceeds the limit of ten. Please reenter your strength stat: ");
            userS = s1.nextInt();
            strength = (userS + 1);
        }

        System.out.print(pointsLeft + " points left.\nEnter your perception stat: ");
        int perception = 1;
        int userP = p.nextInt();
        perception += userP;
        clear();
        pointsLeft -= userP;
        while(perception > 10)
        {
            System.out.print("Your perception stat exceeds the limit of ten. Please reenter your perception stat: ");
            userP = p1.nextInt();
            perception = (userP + 1);
        }

        System.out.print(pointsLeft + " points left.\nEnter your endurance stat: ");
        int endurance = 1;
        int userE = e.nextInt();
        endurance += userE;
        clear();
        pointsLeft -= userE;
        while(endurance > 10)
        {
            System.out.print("Your endurance stat exceeds the limit of ten. Please reenter your endurance stat: ");
            userE = e1.nextInt();
            endurance = (userE + 1);
        }
        while(userS + userP + userE > 28)
        {
            System.out.print("Your current stat selection exceeds the limit of the twenty eight given SPECIAL points. Please enter a new endurance stat that will not exceed the given limit: ");
            userE = e2.nextInt();
            endurance = (userE + 1);
        }

        System.out.print(pointsLeft + " points left.\nEnter your charisma stat: ");
        int charisma = 1;
        int userC = c.nextInt();
        charisma += userC;
        clear();
        pointsLeft -= userC;
        while(charisma > 10)
        {
            System.out.print("Your charisma stat exceeds the limit of ten. Please reenter your charisma stat: ");
            userC = c1.nextInt();
            charisma = (userC + 1);
        }
        while(userS + userP + userE + userC > 28)
        {
            System.out.print("Your current stat selection exceeds the limit of the twenty eight given SPECIAL points. Please enter a new charisma stat that will not exceed the given limit: ");
            userC = c2.nextInt();
            charisma = (userC + 1);
        }


        System.out.print(pointsLeft + " points left.\nEnter your intelligence stat: ");
        int intelligence = 1;
        int userI = i.nextInt();
        intelligence += userI;
        clear();
        pointsLeft -= userI;
        while(intelligence > 10)
        {
            System.out.print("Your intelligence stat exceeds the limit of ten. Please reenter your intelligence stat: ");
            userI = i1.nextInt();
            intelligence = (userI + 1);
        }
        while(userS + userP + userE + userC + userI > 28)
        {
            System.out.print("Your current stat selection exceeds the limit of the twenty eight given SPECIAL points. Please enter a new intelligence stat that will not exceed the given limit: ");
            userI = i2.nextInt();
            intelligence = (userI + 1);
        }

        System.out.print(pointsLeft + " points left.\nEnter your agility stat: ");
        int agility = 1;
        int userA = a.nextInt();
        agility += userA;
        clear();
        pointsLeft -= userA;
        while(agility > 10)
        {
            System.out.print("Your agility stat exceeds the limit of ten. Please reenter your agility stat: ");
            userA = a1.nextInt();
            agility = (userA + 1);
        }
        while(userS + userP + userE + userC + userI + userA > 28)
        {
            System.out.print("Your current stat selection exceeds the limit of the twenty eight given SPECIAL points. Please enter a new agility stat that will not exceed the given limit: ");
            userA = a2.nextInt();
            agility = (userA + 1);
        }

        System.out.print(pointsLeft + " points left.\nEnter your luck stat: ");
        int luck = 1;
        int userL = l.nextInt();
        luck += userL;
        clear();
        pointsLeft -= userL;
        while(luck > 10)
        {
            System.out.print("Your luck stat exceeds the limit of ten. Please reenter your luck stat: ");
            userL = l1.nextInt();
            luck = (userL + 1);
        }
        while(userS + userP + userE + userC + userI + userA + userL> 28)
        {
            System.out.print("Your current stat selection exceeds the limit of the twenty eight given SPECIAL points. Please enter a new luck stat that will not exceed the given limit: ");
            userL = l2.nextInt();
            luck = (userL + 1);
        }

        //places each SPECIAL stat into an integer variable
        //clear works in vscode, use powershell as backup
        //put each stat selection in a loop to check if it is exceeding ten, make statChoice method only check if count exceeds 27

        System.out.println("\nName: " + house.lawyerName(name));
        System.out.println(house.statChoice(userS,userP,userE,userC,userI,userA,userL));
        System.out.print(house.caseDetail);
    }
}