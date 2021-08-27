/**
 * This is the College Student class.
 *
 * @author Sydney Magee
 * @version 10/8/2020
 */

public abstract class CollegeStudent
{
    protected String description;
    protected String wakeUpTime;
    protected double sleepHours;
    
    public CollegeStudent(String description, String wakeUpTime, double sleepHours)
    {
        this.description = description;
        this.wakeUpTime = wakeUpTime;
        this.sleepHours = sleepHours;
    }

    final void dailyRoutine()
    {
        getUp();
        eatBreakfast();
        travelToApp();
        attendClasses();
        returnHome();
        work();
        relax();
        sleep();      
    }
    final void getUp()
    {
        System.out.println("wakes up at " + wakeUpTime);
    }
    void eatBreakfast()
    {
        System.out.println("Eating breakfast at 8am.");
    }
    void travelToApp()
    {
        System.out.println("Traveling to App at 9am.");
    }
    abstract void attendClasses();

    void returnHome()
    {
        System.out.println("Returning home at 3pm");
    }
    void work()
    {
        System.out.println("Working at 4pm");
    }
    void relax()
    {
        System.out.println("Relaxing at 11pm");
    }
    final void sleep()
    {
        System.out.println("Sleeping at midnight for " + sleepHours + " hours");
    }
}
