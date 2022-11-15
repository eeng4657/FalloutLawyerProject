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
        if (count == 35)
        {
            goodStats = "SPECIAL Stats:" + "\nStrength: " + s + "\nPerception: " + p + "\nEndurance: " + e + "\nCharisma: " + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        }
        while (count != 35)
        {
            if (count != 35)
            {
                goodStats = "Your current stats are not equal to the number of SPECIAL points given. Your current stats are: \nStrength:" + s + "\nPerception: " + p + "\nEndurance: " + "\nCharisma:" + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
            }
        }
        return goodStats;
    }
    //need to add way to replace stats if count != 35, loop as it is now is infinite

    public String caseDetail(int caseNum)
    {
        String caseDet = "";
        if (caseNum == 1)
        {
            caseDet = "\nCase: Dweller v Moreau\nFacts of the Case: The Vault Dweller brings to the defendant Richard Moreau a claim of the Unity project, a plan to expose all remaining human survivors to the Forced Evolutionary Virus to turn them into super mutants united in a hivemind under Mr. Moreau, being an unreasonable and unjust plan for the future of the Wasteland.\nIssue: Will the Unity provide humanity with the best plan for survival in the wake of apocalypse?\nCourt Opinion: Undecided";
        }
        if (caseNum == 2)
        {
            caseDet = "\nCase: House v Courier\nFacts of the Case: Robert House";
        }
        return caseDet;
    }
}