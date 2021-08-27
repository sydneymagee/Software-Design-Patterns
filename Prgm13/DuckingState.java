/**
 * This is the Ducking state.
 */
public class DuckingState implements HeroState
{
    Hero hero;
    public DuckingState(Hero hero)
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
        System.out.println("Standing.");
        hero.setState(hero.getStandingState());
    }
    public void escButtonPressed()
    {
        System.out.println("You are shielded");
        hero.setState(hero.getShieldState());
    }
    public void hitByFire()
    {
        System.out.println("You died");
    }
    public void hitByThrownObject()
    {
        System.out.println("You dodged the thrown object.");
    }
    public void hitByRolledObject()
    {
        System.out.println("You died.");
    }
}

