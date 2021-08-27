/**
 * This is the dead state.
 */
public class DeadState implements HeroState
{
    Hero hero;
    public DeadState(Hero hero)
    {
        this.hero = hero;
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
        System.out.println("You died");
    
    }
    public void hitByThrownObject()
    {
        System.out.println("You died.");
    }
    public void hitByRolledObject()
    {
        System.out.println("You died.");
    }
}

