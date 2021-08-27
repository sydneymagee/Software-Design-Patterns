/**
 * This is the Exercise Science Major.
 */
public class ExerciseScienceMajor extends CollegeStudent
{
    public ExerciseScienceMajor(String description, String wakeUpTime, double sleepHours)
    {
        super(description, wakeUpTime, sleepHours);
    }
    public void attendClasses()
    {
        System.out.println("This Exercise Science Major is going to class.");
    }
    public void eatBreakfast()
    {
        System.out.println("eating toast at 9am.");
    }
    public void travelToApp()
    {
        System.out.println("running to class at 9:30am");
    }
    public void returnHome()
    {
        System.out.println("returns home at 2pm");
    }
    public void work()
    {
        System.out.println("exercises at the gym at 3pm");
    }
    public void relax()
    {
        System.out.println("takes a long shower to realx at 6pm.");
    }
}

