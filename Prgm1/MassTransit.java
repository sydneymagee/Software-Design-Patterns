

public class MassTransit implements TravelStrategy
{
    public void drawMap()
    {
        System.out.println("Map for travelling by mass transit.");
    }
    public void computeTimeEstimate()
    {
        System.out.println("The time estimate for travelling by mass transit.");
    }
    public void findRoute()
    {
        System.out.println("The route for travelling by car.");
    }
    public void computeEnergySavings()
    {
        System.out.println("Best savings by mass transit.");
    }
}

