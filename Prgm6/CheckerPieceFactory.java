/**
 * This is the checker piece factory class.
 */
public class CheckerPieceFactory extends GamePieceFactory
{
    public Piece createPiece(String color, String type)
    {
        Piece piece = null;
        if(color.equals("Red"))
        {
            piece = new CheckerPiece("Red");
        }
        else if(color.equals("Black"))
        {
            piece = new CheckerPiece("Black");
        }
        else
        {
            System.out.println("Unknown type.");
        }
        return piece;
    }
}
