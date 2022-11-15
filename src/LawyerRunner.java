import java.util.Scanner;

public class LawyerRunner
{
    public static void main(String[] args)
    {
        FalloutLawyer dweller = new FalloutLawyer();
        //FalloutLawyer house = new FalloutLawyer(); (in case i want to add 2 possible cases)

        Scanner n = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        //scanning for name, all SPECIAL stats, and case choice

        System.out.print("Enter name: ");
        String name = n.nextLine();
        //places name of lawyer into String variable

        System.out.print("Enter SPECIAL stats (remember, you only have 35 SPECIAL points available)\nEnter your strength stat: ");
        int strength = s.nextInt();
        System.out.print("Enter you perception stat: ");
        int perception = p.nextInt();
        System.out.print("Enter your endurance stat: ");
        int endurance = e.nextInt();
        System.out.print("Enter your charisma stat: ");
        int charisma = c.nextInt();
        System.out.print("Enter your intelligence stat: ");
        int intelligence = i.nextInt();
        System.out.print("Enter your agility stat: ");
        int agility = a.nextInt();
        System.out.print("Enter your luck stat: ");
        int luck = l.nextInt();
        //places each SPECIAL stat into an integer variable
        System.out.println("Would you like to view case 1 or case 2?: ");
        int caseChoice = c2.nextInt();

        System.out.println("\nName: " + dweller.lawyerName(name));
        System.out.println(dweller.statChoice(strength,perception,endurance,charisma,intelligence,agility,luck));
        System.out.print(dweller.caseDetail(caseChoice));
    }
}