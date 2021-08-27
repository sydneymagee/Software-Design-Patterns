/**
 * This is the diving state.
 */
public class DivingState implements HeroState
{
    Hero hero;
    public DivingState(Hero hero)
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
        System.out.println("Jumping!");
        hero.setState(hero.getJumpingState());
    }
    public void escButtonPressed()
    {
        System.out.println("You are shielded");
        hero.setState(hero.getShieldState());
    }
    public void hitByFire()
    {
        System.out.println("You dodged the fire object");
    }
    public void hitByThrownObject()
    {
        System.out.println("You dodged a thrown object.");
    }
    public void hitByRolledObject()
    {
        System.out.println("You died.");
        hero.setState(hero.getDeadState());
    }
}

