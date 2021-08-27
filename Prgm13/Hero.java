/**
 * This is the HeroState class.
 * @author SydneyMagee
 * @version 10/26
 */
public class Hero
{
    String name;
    HeroState standingState;
    HeroState jumpingState;
    HeroState divingState;
    HeroState duckingState;
    HeroState shieldState;
    HeroState deadState;
    
    HeroState state = standingState;

    public Hero(String name)
    {
        standingState = new StandingState(this);
        jumpingState = new JumpingState(this);
        divingState = new DivingState(this);
        duckingState = new DuckingState(this);
        shieldState = new ShieldState(this);
        deadState = new DeadState(this);
        this.name = name;
    }
    public void setState(HeroState state)
    {
        this.state = state;
    }
    public void upArrowPressed()
    {
        state.upArrowPressed();
    }
    public void upArrowReleased()
    {
        state.upArrowReleased();
    }
    public void downArrowPressed()
    {
        state.downArrowPressed();
    }
    public void downArrowReleased()
    {
        state.downArrowReleased();
    }
    public void escButtonPressed()
    {
        state.escButtonPressed();
    }
    public void hitByFire()
    {
        state.hitByFire();
    }
    public void hitByThrownObject()
    {
        state.hitByThrownObject();
    }
    public void hitByRolledObject()
    {
        state.hitByRolledObject();
    }
    //public Hero getHero()
    //{
    //    return Hero();
    //}
    public int getCredits()
    {
        return 0;
        //CHANGE THIS 
    }
    public void setCredits()
    {
        //SET CREDITS
    }
    public HeroState getStandingState()
    {
        return standingState;
    }
    public HeroState getJumpingState()
    {
        return jumpingState;
    }
    public HeroState getDivingState()
    {
        return divingState;
    }
    public HeroState getDuckingState()
    {
        return duckingState;
    }
    public HeroState getShieldState()
    {
        return shieldState;
    }
    public HeroState getDeadState()
    {
        return deadState;
    }
}
