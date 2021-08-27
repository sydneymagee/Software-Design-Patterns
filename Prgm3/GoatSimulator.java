import java.util.Observable;
import java.util.Observer;

/**
 * This is the Goat Simulator class.
 * Contains main method for Goat.
 * @author Sydney Magee
 * @version 8/30/2020
 */

public class GoatSimulator
{
    public static void main(String[] args)
    {
        Goat goat = new Goat();

        ImageDisplay imageDisplay = new ImageDisplay(goat);
        PointDisplay pointDisplay = new PointDisplay(goat);
        ColorDisplay colorDisplay = new ColorDisplay(goat);
        WinnerDisplay winnerDisplay = new WinnerDisplay(goat);

        goat.addPoints(10);
        goat.addPoints(100);
        goat.addPoints(10);
        goat.addPoints(100);
        goat.addPoints(10);
        goat.addPoints(100);
        goat.addPoints(10);
        goat.addPoints(100);
        goat.addPoints(10);
        goat.addPoints(100);
        goat.addPoints(500); 
        
        
    }
}
