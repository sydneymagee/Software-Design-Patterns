import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class ArchiveDisplay implements Observer, DisplayElement
{
    Observable observable; 
    ArrayList<Float> tempList; 
    float temperature;
    
    public ArchiveDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
        tempList = new ArrayList<Float>();
    }

    public void update(Observable obs, Object arg)
    {
        //write code to log the current temperature
        if (obs instanceof WeatherData)
        {             
                WeatherData weatherData = (WeatherData)obs;
                temperature = weatherData.getTemperature();
                tempList.add(temperature);
                display();   
        }
    }

    public void display()
    {
        //write code to display all temperatures achieved thus far.
        System.out.println("Archive List: " + tempList);
       
    }

}


