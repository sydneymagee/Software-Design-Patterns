/**
 * This is the hero state interface.
 */
public interface HeroState
{
    public void upArrowPressed();
    public void upArrowReleased();
    public void downArrowPressed();
    public void downArrowReleased();
    public void escButtonPressed();
    public void hitByFire();
    public void hitByThrownObject();
    public void hitByRolledObject();
    //public Hero getHero();
}
