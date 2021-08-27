import java.util.Observer;
import java.util.Observable;

/**
 * This is the ImageDisplay class.
 * @author Sydney Magee
 * @version 8/28/2020
 */

public class ImageDisplay implements Observer, DisplayElement
{
    Observable observable;
    private String name;

    public ImageDisplay(Observable observable)
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
            display();
        }
    }
    public void display()
    {
        System.out.println(name + " is made bigger.");
    }

}
