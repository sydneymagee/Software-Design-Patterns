import java.util.Observer;
import java.util.Observable;

/**
 * This is the PointDisplay class.
 * @author Sydney Magee
 * @version 8/28/2020
 */

public class PointDisplay implements Observer, DisplayElement
{
    Observable observable;
    private String name;
    private int score;
    private int points;
    
    public PointDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    } 
    public void update(Observable obs, Object arg)
    {
        if(obs instanceof Goat)
        {
            Goat goat = (Goat)obs;
            this.name = goat.getName();
            this.score = goat.getScore();
            display();   
        }
    }
    public void display()
    {
        System.out.println(name + " ate something and now has " + score + "points");
    }
}
