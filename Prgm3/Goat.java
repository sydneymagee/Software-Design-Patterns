import java.util.Observer;
import java.util.Observable;
/**
 * This is a Goat Simulator Program.
 * @author Sydney Magee
 * @version 8/28/2020
 */

public class Goat extends Observable
{
    Observable observable;
    private String name;
    private int score;    

public Goat()
{
    name = "Goat";
    score = 0;
}
public int addPoints(int points)
{
    if(score >= 0)
    {
        score += points;
        setChanged();
        notifyObservers();
        return score;
    }
    else
    {
        return 0;
    }
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name = name;
}
public int getScore()
{
    return score;
}
public void setScore(int score)
{
    this.score = score;
}


}
