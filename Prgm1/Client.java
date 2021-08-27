/**
 * SYDNEY MAGEE
 * ASSIGNMENT1
 */


public class Client  
{

    public static void main(String[] args)
    {
        TravelStrategy d1 = new ByCar();
        TravelStrategy d2 = new Walking();
        TravelStrategy d3 = new MassTransit();

        d1.drawMap();
        d1.computeEnergySavings();
        d2.drawMap();
        d2.computeEnergySavings();
        d3.drawMap();
        d3.computeEnergySavings();


    }



}
