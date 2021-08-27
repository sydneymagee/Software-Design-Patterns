/**
 * This is the shielded state.
 */
public class ShieldState implements HeroState
{
    Hero hero;
    public ShieldState(Hero hero)
    {
        this.hero = hero;
        try
        {
           Thread.sleep(3);
           hero.setState(hero.getStandingState());
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void upArrowPressed()
    {
    }
    public void upArrowReleased()
    {
    }
    public void downArrowPressed()
    {
    }
    public void downArrowReleased()
    {
    }
    public void escButtonPressed()
    {
    }
    public void hitByFire()
    {
    }
    public void hitByThrownObject()
    {
    }
    public void hitByRolledObject()
    {
    }
}

