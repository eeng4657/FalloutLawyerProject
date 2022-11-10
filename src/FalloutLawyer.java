public class FalloutLawyer
{
    public FalloutLawyer() {}

    public int s;
    //stores the Strength stat of the player character
    public int p;
    //stores the Perception stat of the player character
    public int e;
    //stores the Endurance stat of the player character
    public int c;
    //stores the Charisma stat of the player character
    public int i;
    //stores the Intelligence stat of the player character
    public int a;
    //stores the Agility stat of the player character
    public int l;
    //stores the Luck stat of the player character

    public String lawyerName(String name)
    {
        return name;
    }
    //name of player character

    public String statChoice(int s,int p,int e,int c,int i,int a,int l) 
    {
        String goodStats = "";
        int count = (s + p + e + c + i + a + l);
        if (count != 28)
        {
            goodStats = "Your current stats are not equal to the number of SPECIAL points given. Your current stats are: \nStrength:" + s + "\nPerception: " + p + "\nEndurance: " + "\nCharisma:" + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        }
        else goodStats = "Strength:" + s + "\nPerception: " + p + "\nEndurance: " + "\nCharisma:" + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        return goodStats;
    }
    //need to add way to replace any of the stats and repeat loop, will check other classwork to see

    public String caseName = "Dweller v Gray";

}