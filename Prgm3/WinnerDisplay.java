import java.util.Observable;
import java.util.Observer;

/**
 *   This is the WinnerDisplay class.
 *   @author Sydney Magee
 *   @version 8/28/2020
 **/

public class WinnerDisplay implements Observer, DisplayElement
{
    Observable observable;
    private String name;
    private int score;

    public WinnerDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg)
    {
        if(obs instanceof Goat)
        {
            Goat goat = (Goat)obs;
            this.score = goat.getScore();
            if(score >= 1000)
            {
                this.name = goat.getName();
                display();
            }
        }
    }
    public void display()
    {
        System.out.println(name + " wins.");
    }
}

