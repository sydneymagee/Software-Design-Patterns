

public abstract class Directions 
{
    TravelStrategy travelStrategy;


public Directions() {}


public void setTravelStrategy(TravelStrategy t)
{
    travelStrategy = t;
}

public void performDrawMap()
{
    travelStrategy.drawMap();
    travelStrategy.computeEnergySavings();
}

public void performComputeTimeEstimate()
{
    travelStrategy.computeTimeEstimate();
}

public void performFindRoute()
{
    travelStrategy.findRoute();
}

}
