import java.util.Scanner;
/**
 * This is Gas Station 2.
 *
 * @author Sydney Magee
 * @version 10/13/2020
 */
public class GasStation2 extends PayAtPump
{
    public GasStation2(String name, String acceptedCreditCard,
                        boolean carWash, double carWashCost)
    {
        super(name, acceptedCreditCard, carWash, carWashCost);
    }
    
    public void isPaymentAccepted()
    {
       kb = new Scanner(System.in);
       System.out.println("Cash or card?");
       String choice = kb.nextLine();
       if(choice.equals("cash") || choice.equals("Cash"))
       {
           acceptedCreditCard = "Not accepted";
           System.out.println("Please go inside to complete your payment.");
       }
       else if(choice.equals("card") || choice.equals("Card"))
       {
           System.out.println("What type of card do you wish to use? ");
           choice = kb.nextLine();
           acceptedCreditCard = choice;
           System.out.println("You are using " + choice);
       }
    }
    public void swipeOrInsert()
    {
        System.out.println("Please swipe your card.");
    }
    public String carWashOption()
    {
        carWash = false;
        String cw = "Coming Soon.";
        return cw;
    }
    public void carWashNote()
    {
        System.out.println("Our car wash is coming soon!");
    }
    
}
