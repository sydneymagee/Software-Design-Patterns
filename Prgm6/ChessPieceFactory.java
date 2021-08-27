/**
 * ChessPieceFactory is a Simple Factory.
 * @author Sydney Magee
 * @version 9/10/2020
 */

public class ChessPieceFactory extends GamePieceFactory
{

    public Piece createPiece(String color, String type)
    {
        Piece piece = null;
        if(type.equals("Rook"))
        {
            piece = new Rook(color);
        }
        else if(type.equals("Bishop"))
        {
            piece = new Bishop(color);
        }
        else if(type.equals("knight"))
        {
            piece = new Knight(color); 
        }
        else if(type.equals("Queen"))
        {
            piece = new Queen(color);
        }
        else if(type.equals("King"))
        {
            piece = new King(color);
        }
        else if(type.equals("Pawn"))
        {
            piece = new Pawn(color);
        }
        else
        {
            System.out.println("Unknown type.");
        }
        return piece;
    }
}
