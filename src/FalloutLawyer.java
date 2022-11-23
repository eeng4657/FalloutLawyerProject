public class FalloutLawyer
{
    public FalloutLawyer() {}

    public String lawyerName(String name)
    {
        return name;
    }
    //name of player character

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
            goodStats = "Your current stats are not equal to the number of SPECIAL points given and/or at least one of your stats exceed the limit of ten. Your current stats are: \nStrength: " + s + "\nPerception: " + p + "\nEndurance: " + "\nCharisma: " + c + "\nIntelligence: " + i + "\nAgility: " + a + "\nLuck: " + l;
        } 
        return goodStats;
    }
    //need to add way to replace stats if count != 35, loop as it is now is infinite

    public String caseDetail = 
    "\nCase: House v Courier\nFacts of the Case: Robert Edwin House, founder of pre-war mega corporation RobCo, has been searching for a hard drive in the form of a platinum chip containing vital system upgrades for the computer that allows him to control the city of New Vegas and the Strip for over two centuries after the Great War rained nukes over the continental United States. The defendant, The Courier, was set to deliver it to Mr. House, but was apprehended by a gang looking to undermine Mr. House. After retrieving the chip back, the Courier now refuses to deliver the platinum chip, arguing that Mr. House should not remain in control of New Vegas.\n";

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

    public String caseResult(int s,int p,int e,int c, int i, int a,int l)
    {
        String result = "";
        if(e>s && e>p && e>c && e>i && e>a && a>l)
        {
            result = "\nThe defense endured a long rant by Mr. House about his history and how important the platinum chip was to the future of humanity. The rant ended when the defense called Mr. House crazy for trusting Benny, the man who first apprehended and stole the platinum chip from the Courier. Mr. House responded with the following:\n\"I am not crazy! I know he swapped those chips! I knew it wasn't the correct one. The chip had to be platinum. As if I could ever make such a mistake. Never. Never! I just – I just couldn't prove it. He – he covered his tracks, he got that idiot Securitron to lie for him. You think this is something? You think this is bad? This? This chicanery? You're doing worse. That gunshot! Are you telling me that a man just happens to come back from the dead like that? No! I orchestrated it! Me! You defecated on my plans for humanity! And I saved you! And I shouldn't have. I took you into my own casino! What was I thinking? You'll never change. You'll never change! Ever since you had to deliver the chip to me, always the same! Couldn't keep his hands off of my property! By the time I was thirty years old, I was a billionaire thirty times over. I founded and ran a vast economic empire.  And now you get to ransom my own property to me!? What a sick joke! I should've stopped Benny when I had the chance! And you - be a good courier and deliver my property TO ME!\"\n Upon the end of this last sentence, Mr. House's operating system crashed under the stress of the vitriol of its user. The defense wins through an feat of endurance, an estimated three hours of listening to Mr. House talking about himself.";
        }
        return result;
    }
}