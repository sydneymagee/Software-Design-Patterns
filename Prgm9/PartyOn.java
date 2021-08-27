/*
 * This is the PartyOn macro command.
 */
public class PartyOn implements Command
{
    Command[] partyOn;

    public PartyOn(Command[] partyOn)
    {
        this.partyOn = partyOn;
    }
    public void execute()
    {
        for(int i = 0; i < partyOn.length; i++)
        {
            partyOn[i].execute();
        }
    }
    public void undo()
    {
        for(int i = partyOn.length -1; i >= 0; i--)
        {
            partyOn[i].undo();
        }
    }
}
