

public class Walking implements TravelStrategy
{
    public void drawMap()
    {
        System.out.println("Map for travelling by walking.");
    }
    public void computeTimeEstimate()
    {
        System.out.println("The time estimate for travelling by walking.");
    }
    public void findRoute()
    {
        System.out.println("The route for travelling by walking.");
    }
    public void computeEnergySavings()
    {
        System.out.println("Some savings by walking.");
    }
}
