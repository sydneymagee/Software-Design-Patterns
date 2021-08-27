import java.util.*;
/**
 * This is the Account class.
 * It is a Singleton class.
 * 
 * I would use the Observer design pattern to implement the rest of the program.
 * The Observer pattern is useful because it is easy to keep the file synchronized and 
 * the users notified. 
 *
 * @author Sydney Magee
 * @version 9/18/2020
 */
public class Account 
{
    private volatile static Account accInstance;
    private HashMap<String, String> accInfo;

    private Account()
    {
        accInfo = new HashMap<String, String>();
    }

    public static Account getInstance()
    {
        if(accInstance == null)
        {
            synchronized (Account.class)
            {
                if(accInstance == null)
                {
                    accInstance = new Account();
                }
            }
        }
        return accInstance;
    }
    
    public void add(String acc, String pw)
    {
        accInfo.put(acc, pw);
    }

    public void remove(String acc)
    {
        if(accInfo.containsValue(acc))
        {
            accInfo.remove(acc);
        }
    }
    
    public String get(String acc)
    {
        String pw = null;
        if(accInfo.containsValue(acc))
        {
            pw = accInfo.get(2);
        }
        return pw;
    }
     
}
