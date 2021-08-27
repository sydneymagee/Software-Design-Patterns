/*
 * This is the PartyOff Macro command.
 */

public class PartyOff implements Command
{
    Command[] partyOff;

    public PartyOff(Command[] partyOff)
    {
        this.partyOff = partyOff;
    }

    public void execute()
    {
        for(int i = 0; i < partyOff.length; i++)
        {
            partyOff[i].execute();
        }
    }
    public void undo()
    {
        for(int i = partyOff.length -1; i >= 0; i--)
        {
            partyOff[i].undo();
        }
    }
}
