import java.util.Scanner;

public class LawyerRunner
{
    public static void main(String[] args)
    {
        FalloutLawyer dweller = new FalloutLawyer();

        Scanner n = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = n.nextLine();

        System.out.print("Enter SPECIAL stats (remember, you only have 28 SPECIAL points available)\nEnter your strength stat: ");
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
        System.out.print("Luck: ");
        int luck = l.nextInt();

        System.out.println("\nName: " + dweller.lawyerName(name));
        System.out.print(dweller.statChoice(strength,perception,endurance,charisma,intelligence,agility,luck));
    }
}