/**
 * This is the Wizard class.
 *
 * @author Sydney Magee
 * @version 10/30/20
 */
public class Wizard 
{
    String name;
    int credits;

    public Wizard(String name, int credits)
    {
        this.name = name;
        this.credits = credits;
    }

    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name = name;
    }
    public int getCredits()
    {
        return credits;
    }
    public void setCredits()
    {
        this.credits = credits;
    }
    //add a toString method to returns the wiz's name
}
