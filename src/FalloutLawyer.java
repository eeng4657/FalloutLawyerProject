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
        boolean isGood = (count == 27 && s<=10 && p<=10 && e<=10 && c<=10 && i<=10 && a<=10 && l<=10);
        if (isGood == true)
        {
            goodStats = "SPECIAL Stats:" + "\nStrength: " + s + "\nPerception: " + p + "\nEndurance: " + e + "\nCharisma: " + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        }
        if (isGood == false)
        {
            goodStats = "Your current stats are not equal to the number of SPECIAL points given and/or at least one of your stats exceed the limit of ten. Your current stats are: \nStrength:" + s + "\nPerception: " + p + "\nEndurance: " + "\nCharisma:" + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        } 
        
        return goodStats;
    }
    //need to add way to replace stats if count != 35, loop as it is now is infinite

    public String caseDetail = 
    "\nCase: House v Courier\nFacts of the Case: Robert Edwin House";
}