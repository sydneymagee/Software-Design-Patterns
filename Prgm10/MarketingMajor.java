/**
 * This is the Marketing major class.
 */
public class MarketingMajor extends CollegeStudent
{
    public MarketingMajor(String description, String wakeUpTime, double sleepHours)
    {
        super(description, wakeUpTime, sleepHours);
    }
    public void attendClasses()
    {
        System.out.println("The marketing major is going to class!");
    }
    public void eatBreakfast()
    {
        System.out.println("eating cereal at 1pm");
    }
    public void travelToApp()
    {
        System.out.println("walking to App at 1:30pm");
    }
    public void returnHome()
    {
        System.out.println("returns home at 3pm");
    }
    public void work()
    {
        System.out.println("working at Ale House, serving drinks at 5pm");
    }
    public void relax()
    {
        System.out.println("chilling on the couch at 11pm");
    }
}
