import java.util.Scanner;
/**
 * This is the Pay At Pump class.
 *
 * @author Sydney Magee
 * @version 10/13/2020
 */
public abstract class PayAtPump
{
    protected String name;
    protected String acceptedCreditCard;
    protected boolean carWash;
    protected double carWashCost;
    Scanner kb;
    String zip;

    public PayAtPump(String name, String acceptedCreditCard, 
                        boolean carWash, double carWashCost)
    {
        this.name = name;
        this.acceptedCreditCard = acceptedCreditCard;
        this.carWash = carWash;
        this.carWashCost = carWashCost;
    }
    final void payForGas()
    {
        choosePaymentMethod();
        isPaymentAccepted();
         
        if(!acceptedCreditCard.equals("Not accepted"))
        {
            swipeOrInsert();
            isCardAccepted();
            if(zip.equals("accepted"))
            {
                pumpingGas();
                returnPump();
                chooseReceipt();
            }
        }
        if(carWash == true)
        {
            carWashNote();
        }
    }
    void choosePaymentMethod()
    {
        System.out.println("At " + name + ", we accept most major credit cards, but not American Express.");    
    }

    abstract void isPaymentAccepted();
    
        
    void swipeOrInsert()
    {
        System.out.println("Please swipe or insert your card.");
    }

    String zipCode()
    {
        kb = new Scanner(System.in);
        System.out.println("What is your zip code? ");
        //String zip;
        zip = kb.nextLine();
        if(zip.matches("[0-9]{5}"))
        {
            System.out.println("Zip accepted.");
            zip = "accepted";
        }
        else
        {
            System.out.println("Invalid zip.");
            zip = "invalid zip";
        }
        return zip;
    }

    void isCardAccepted()
    {
        String zip = zipCode();
        if(zip == "invalid zip" || acceptedCreditCard == "Not accepted")
        {
            System.out.println("Your card has been declined.");
        }
        else
        {
            System.out.println("Your card has been accepted.");
        }
    }

    abstract String carWashOption();

    String selectGasOrDiesel()
    {
        kb = new Scanner(System.in);
        System.out.println("Gas or Diesel?");
        String choice = kb.nextLine();
        if(choice == "Gas" || choice == "gas")
        {
            System.out.println("You chose gas.");
        }
        else if(choice == "Diesel" || choice == "diesel")
        {
            System.out.println("You chose diesel.");
        }
        return choice;
    }
    
    void pumpingGas()
    {
        String choice = selectGasOrDiesel();
        System.out.println("You are pumping " + choice);
    }

    final void returnPump()
    {
        System.out.println("Please return the pump.");
    }

    void chooseReceipt()
    {
        kb = new Scanner(System.in);
        System.out.println("Do you want your receipt? Yes or No");
        String ans = kb.nextLine();
        if(ans.equals("Yes") || ans.equals("yes"))
        {
            System.out.println("Printing your receipt.");
        }
        else if(ans.equals("No") || ans.equals("no"))
        {
            System.out.println("Thanks. Have a great day!");
        }
    }
    
    abstract void carWashNote();

}












