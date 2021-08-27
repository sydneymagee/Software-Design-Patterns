import java.util.Observable;
import java.util.Observer;

/**
 ** This is the ColorDisplay class.
 ** @author Sydney Magee
 ** @version 8/28/2020
 **/

public class ColorDisplay implements Observer, DisplayElement
{
    Observable observable;
    private String currentColor;
    private int score;

    public ColorDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
        currentColor = "green";
    }   
    public void update(Observable obs, Object arg)
    {
        if (obs instanceof Goat)
        {
            Goat goat = (Goat)obs;
            this.score = goat.getScore();
            if(score < 500)
            {
                currentColor = "Green";
            }
            else if(score >= 500 && score < 900)
            {
                currentColor = "Yellow";
            }
            else if(score >= 900)
            {
                currentColor = "Red";
            }
        display();
        }
    }
    public void display()
    {
        System.out.println("The new color scheme is " + currentColor);
    }
}
