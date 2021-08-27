/**
 * This is the Client class that contains the main method.
 *
 * @author Sydney Magee
 * @version 10/8/2020
 */

public class Client
{

    public static void main(String[] args)
    {
       MarketingMajor mm = new MarketingMajor("Marketing Major", "Noon", 12);
       System.out.println("The Marketing Major is ");
       mm.dailyRoutine();
       
       CSMajor cs = new CSMajor("Computer Science Major", "6:30am", 6.5);
       System.out.println("The CS major is ");
       cs.dailyRoutine();
       
       ExerciseScienceMajor es = new ExerciseScienceMajor("Exercise Science Major", "8am", 8);
       System.out.println("The Exercise Science Major is ");
       es.dailyRoutine(); 
    }
}
