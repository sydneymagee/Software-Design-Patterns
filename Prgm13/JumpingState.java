/**
 * This is the jumping state.
 */
public class JumpingState implements HeroState
{
    Hero hero;
    public JumpingState(Hero hero)
    {
        this.hero = hero;
    }
    public void upArrowPressed()
    {
    }
    public void upArrowReleased()
    {
        System.out.println("Standing.");
        hero.setState(hero.getStandingState());
    }
    public void downArrowPressed()
    {
        System.out.println("Diving");
        hero.setState(hero.getDivingState());
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
        System.out.println("You jumped over the fire");
    }
    public void hitByThrownObject()
    {
        System.out.println("You have been hit.");
        hero.setState(hero.getDeadState());
    }
    public void hitByRolledObject()
    {
        System.out.println("You jumped over the rolling object.");
    }
}

