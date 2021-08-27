import java.util.Scanner;
/**
 * This is Gas Station 1.
 *
 * @author Sydney Magee
 * @version 10/13/2020
 */
public class GasStation1 extends PayAtPump
{
    public GasStation1(String name, String acceptedCreditCard, 
                        boolean carWash, double carWashCost)
    {
        super(name, acceptedCreditCard, carWash, carWashCost);
    }
    
    public void isPaymentAccepted()
    {
        kb = new Scanner(System.in);
        System.out.println("What type of credit card do you wish to use? ");
        String card = kb.nextLine();
        if(card.equals("AMEX") || card.equals("amex") || card.equals("American Express")
                || card.equals("american express"))
        {
            System.out.println("We do not accept American Express");
            acceptedCreditCard = "Not accepted";
        }
        else
        {
            acceptedCreditCard = card;
            System.out.println("Your payment method is: " + acceptedCreditCard);
        }
    }

    public String carWashOption()
    {
        System.out.println("We have basic, mid, and supreme styled car washes.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Please choose from the following: basic or mid or supreme.");
        String choice = kb.nextLine();
        if(choice.equals("basic") || choice.equals("Basic"))
        {
            carWashCost = 8;
            carWash = true;
        }
        if(choice.equals("Mid") || choice.equals("mid"))
        {
            carWashCost = 10;
            carWash = true;
        }
        if(choice.equals("Supreme") || choice.equals("supreme"))
        {
            carWashCost = 12;
            carWash = true;
        }
     
        return choice;
    }
    public void carWashNote()
    {
        String choice = carWashOption();
        System.out.println("Your " + choice + " car wash costs " + carWashCost);
        
    }

}
