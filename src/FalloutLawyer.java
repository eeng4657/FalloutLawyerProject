/**
 * The FalloutLawyer class represents a lawyer in the situation of the game. This lawyer would have seven unique aspects to their character called SPECIAL stats, which decides how the game ends.
 */
public class FalloutLawyer
{
    private int s;
    private int p;
    private int e;
    private int c;
    private int i;
    private int a;
    private int l;

    /**
     * Constructor for the FalloutLawyer class. This creates a new instance of a lawyer. 
     * Has no parameters, can be called without first defining the name of the player.
     */
    public FalloutLawyer() {}
    
    /**
     * Counstructor for the FalloutLawyer class. This creates a new instance of a lawyer.
     * @param n represents the name of the lawyer.
     */
    public FalloutLawyer(String n) 
    {
        n = this.lawyerName(n);
    }
    // game can be initialized two ways, one with name as a parameter, and one without name
    
    /**
     * String method for the FalloutLawyer class. This will contain the name of the lawyer.
     * @param name stores the name of the player in a String.
     * @return returns the name of the player as a String.
     */
    public String lawyerName(String name)
    {
        return name;
    }
    //name of player character
    
    /**
     * String method for the FalloutLawyer class. This will return a String accepting or rejecting the stat choice the player gives.
     * @param s represents the Strength stat.
     * @param p represents the Perception stat.
     * @param e represents the Endurance stat.
     * @param c represents the Charisma stat.
     * @param i represents the Intelligence stat.
     * @param a represents the Agility stat.
     * @param l represents the Luck stat.
     * @return returns a String either accepting the player's choice and printing the stats out in an easy to read format, or denying the player's SPECIAL stat choices.
     */
    public String statChoice(int s,int p,int e,int c,int i,int a,int l) 
    {
        String goodStats = "";
        int count = (s + p + e + c + i + a + l);
        boolean isBad = (count != 35);
        if (isBad == false)
        {
            goodStats = "SPECIAL Stats:" + "\nStrength: " + s + "\nPerception: " + p + "\nEndurance: " + e + "\nCharisma: " + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        }
        if (isBad == true)
        {
            goodStats = "Your current stats are not equal to the number of SPECIAL points given and/or at least one of your stats exceed the limit of ten.";
        } 
        return goodStats;
    }
    
    /**
     * String method for the FalloutLawyer class. Prints out a String value documenting the name and details of the situation the player is placed in ingame.
     */
    public String caseDetail = 
    "\nCase: House v Courier\nFacts of the Case: Robert Edwin House, founder of pre-war mega corporation RobCo, has been searching for a hard drive in the form of a platinum chip containing vital system upgrades for the computer that allows him to control the city of New Vegas and the Strip for over two centuries after the Great War rained nukes over the continental United States. The defendant, The Courier, was set to deliver it to Mr. House, but was apprehended by a gang looking to undermine Mr. House. After retrieving the chip back, the Courier now refuses to deliver the platinum chip, arguing that Mr. House should not remain in control of New Vegas.\n";

    /**
     * String method for the FalloutLawyer class. Determines if the player's luck stat is high enough to get a special ending.
     * @param l represents the player's Luck stat.
     * @return returns a String either resulting in the special ending if Luck stat is high enough, or returns an empty String, resulting in a different ending.
     */
    public String riggedFromTheStart(int l)
    {
        String allIn = "";
        if(l == 10)
        {
            allIn = "\nCase Result: Just as Mr. House was about to speak, the operating system of his supercomputer crashed, disabling the life support system keeping Mr. House's centuries-old, perserved body alive. The defendant wins by default. The House Has Gone Bust!";
        }
        else
        {
            int dumbLuck = (int)(Math.random()*10);
            if(l < 5)
            {
                allIn = "";
            }
            else if(l>5 && l!=10)
            {
                if(dumbLuck == 10)
                {
                    allIn = "\nCase Result: Just as Mr. House was about to speak, the operating system of his supercomputer crashed, disabling the life support system keeping Mr. House's centuries-old, perserved body alive. The defendant wins by default. The House Has Gone Bust!";
                }
                else if(dumbLuck != 10)
                {
                    allIn = "";
                }
            }
        }
        return allIn;
    }

    /**
     * String method for the FalloutLawyer class. Determines the ending based on which stat is the highest.
     * @param s represents the player's Strength stat.
     * @param p represents the player's Perception stat.
     * @param e represents the player's Endurance stat.
     * @param c represents the player's Charisma stat.
     * @param i represents the player's Intelligence stat.
     * @param a represents the player's Agility stat.
     * @param l represents the player's Luck stat.
     * @return returns a String based on which of the SPECIAL stats is highest.
     */
    public String caseResult(int s,int p,int e,int c, int i, int a,int l)
    {
        String result = "";
        if(e>s && e>p && e>c && e>i && e>a && a>l)
        {
            result = "\nCourt Decision: The defense endured a long rant by Mr. House about his history and how important the platinum chip was to the future of humanity. The rant ended when the defense called Mr. House crazy for trusting Benny, the man who first apprehended and stole the platinum chip from the Courier. Mr. House responded with the following:\n\n\"I am not crazy! I know he swapped those chips! I knew it wasn't the correct one. The chip had to be platinum. As if I could ever make such a mistake. Never. Never! I just - I just couldn't prove it. He - he covered his tracks, he got that idiot Securitron to lie for him. You think this is something? You think this is bad? This? This chicanery? You're doing worse. That gunshot! Are you telling me that a man just happens to come back from the dead like that? No! I orchestrated it! Me! You defecated on my plans for humanity! And I saved you! And I shouldn't have. I took you into my own casino! What was I thinking? You'll never change. You'll never change! Ever since you had to deliver the chip to me, always the same! Couldn't keep his hands off of my property! By the time I was thirty years old, I was a billionaire thirty times over. I founded and ran a vast economic empire.  And now you get to ransom my own property to me!? What a sick joke! I should've stopped Benny when I had the chance! And you - be a good courier and deliver my property TO ME!\"\n\nUpon the end of this last sentence, Mr. House's operating system crashed under the stress of the vitriol of its user. The defense wins through an feat of endurance, an estimated three hours of listening to Mr. House talking about himself.";
        }
        return result;
    }
}