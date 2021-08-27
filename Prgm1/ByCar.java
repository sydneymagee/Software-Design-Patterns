

public class ByCar implements TravelStrategy
{
    public void drawMap()
    {
        System.out.println("Map for travelling by car.");
    }
    public void computeTimeEstimate()
    {
        System.out.println("The time estimate for travelling by car.");
    }
    public void findRoute()
    {
        System.out.println("The route for travelling by car.");
    }
    public void computeEnergySavings()
    {
        System.out.println("No savings by car.");
    }
}
