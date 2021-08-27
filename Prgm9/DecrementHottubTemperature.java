/*
 * This is the DecrementHottubTemperature Command Class.
 *
 * @author Sydney Magee
 * @version 9/22/2020
 */

public class DecrementHottubTemperature implements Command
{
    Hottub hottub;

    public DecrementHottubTemperature(Hottub hottub)
    {
        this.hottub = hottub;
    }
    public void execute()
    { 
        hottub.Decrement();
    }
    public void undo()
    {
        hottub.Increment();
    }
}
