/**
 * This is the CS Major class.
 */
public class CSMajor extends CollegeStudent
{
    public CSMajor(String description, String wakeUpTime, double sleepHours)
    {
        super(description, wakeUpTime, sleepHours);
    }
    public void attendClasses()
    {
        System.out.println("This CS Major is attending class.");
    }
    public void eatBreakfast()
    {
        System.out.println("eating a yogurt at 7am");
    }
    public void travelToApp()
    {
        System.out.println("driving to App at 8am");
    }
    public void returnHome()
    {
        System.out.println("return home at 1pm");
    }
    public void work()
    {
        System.out.println("working on mass amounts of homework at 2pm");
    }
    public void relax()
    {
        System.out.println("reading the textbook to realx at 10pm");
    }
}
