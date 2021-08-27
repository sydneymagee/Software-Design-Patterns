import java.text.NumberFormat;
/**
 * This contains the main method for 
 * our example of the Decorator Pattern.
 * Starbuzz Coffee
 *
 * @author Sydney Magee
 * @version 9/3/2020
 */

public class StarbuzzCoffee {
 
    public static void main(String args[]) {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Sugar(beverage);
        System.out.println(beverage.getDescription() 
                + " $" + beverage.cost());

        Beverage beverage2 = new Varietal(); 
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Sugar(beverage2);  
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(beverage2.getDescription() 
                + " " + formatter.format(beverage2.cost())); 
    }
}
