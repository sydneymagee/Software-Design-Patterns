import java.util.Scanner;
/**
 * This is client or driver class.
 *
 * @author Sydney Magee
 * @version 10/13/2020
 */
public class Client
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please choose 1 or 2");
        int choice = kb.nextInt();
        if(choice == 1)
        {
            GasStation1 gas1 = new GasStation1("Gas Town", "Visa", true, 8);
            gas1.payForGas(); 
        }
        else if(choice == 2)
        {
            GasStation2 gas2 = new GasStation2("Speedway", "MasterCard", false, 0);
            gas2.payForGas();
        }
        else
        {
            System.out.println("Choose again, either 1 or 2");
        }
    }

}
