/**
 * This is the Sugar class.
 * @author Sydney Magee
 * @version 9/3/2020
 */

public class Sugar extends CondimentDecorator
{
    public Sugar(Beverage beverage)
    {
        this.beverage = beverage;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ", Sugar";
    }
    public double cost()
    {
        return beverage.cost();
    }
}
