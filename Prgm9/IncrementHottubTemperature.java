/*
 * This is the IncrementHottubTemperature Command Class
 *
 * @author Sydney Magee
 * @version 9/22/2020
 */
public class IncrementHottubTemperature implements Command
{
    Hottub hottub;

    public IncrementHottubTemperature(Hottub hottub)
    {
        this.hottub = hottub;
    }
    public void execute()
    {
        hottub.Increment();
    } 
    public void undo()
    {
        hottub.Decrement();
    }
}
