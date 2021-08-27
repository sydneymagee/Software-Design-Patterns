/**
 * This is the standing state.
 */
public class StandingState implements HeroState
{
    Hero hero;
    public StandingState(Hero hero)
    {
        this.hero = hero;
    }
    public void upArrowPressed()
    {
        System.out.println("Jumping!");
        hero.setState(hero.getJumpingState());
    }
    public void upArrowReleased()
    {
    }
    public void downArrowPressed()
    {
        System.out.println("Ducking");
        hero.setState(hero.getDuckingState());
    }
    public void downArrowReleased()
    {
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
        System.out.println("You died.");
    }
    public void hitByRolledObject()
    {
        System.out.println("You died.");
    }
}

