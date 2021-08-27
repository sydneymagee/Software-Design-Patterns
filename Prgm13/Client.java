/**
 * This is the client class.
 * @author Sydney Magee
 * @version 10/26/2020
 */
public class Client
{
    public static void main(String[] args)
    {
        Hero hero = new Hero("SuperWoman");
        System.out.println("The super hero's name is " + hero.name);
        hero.downArrowPressed();
        hero.downArrowReleased();
        hero.upArrowPressed();
        hero.hitByRolledObject();
        hero.upArrowReleased();
        hero.upArrowPressed();
        hero.downArrowPressed();
        hero.hitByFire();
        hero.downArrowReleased();
        hero.upArrowReleased();
        hero.escButtonPressed();
        try
        {
            Thread.sleep(6);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        hero.hitByRolledObject();

    }
}
