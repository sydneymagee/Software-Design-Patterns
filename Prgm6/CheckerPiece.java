/**
 * This is the checker piece class.
 */
public class CheckerPiece extends Piece
{
    public CheckerPiece(String color)
    {
        if(color == "Red")
        {
            this.color = "R";
        }
        else if(color == "Black")
        {
            this.color = "B";
        }
        
        type = "Checker Piece";
    }
}
