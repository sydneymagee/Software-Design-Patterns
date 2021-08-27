/**
 * This is the Client class.
 * @author Sydney Magee
 * @version 9/11/2020
 */
public class Client
{
     
    public static void main(String[] args)
    {
        GamePieceFactory factory = new ChessPieceFactory();
        Chess chess = new Chess(factory);
        chess.play();

        GamePieceFactory factory1 = new CheckerPieceFactory();
        Checkers check = new Checkers(factory1);
        check.play();

    }
}
