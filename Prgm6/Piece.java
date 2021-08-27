/**
 * Piece class is abstract class.
 * @author Sydney Magee
 * @version 9/10/2020
 */

abstract public class Piece 
{
    String color;
    String type;

    public String toString()
    {
        if(color == "black")
        {
            color = "B";
        }
        else if(color == "white")
        {
            color = "W";
        }
        if(type == "Rook")
        {
            type = "R";
        }
        else if(type == "Bishop")
        {
            type = "B";
        }
        else if(type == "knight")
        {
            type = "k";
        }
        else if(type == "Queen")
        {
            type = "Q";
        }
        else if(type == "King")
        {
            type = "K";
        }
        else if(type == "Pawn")
        {
            type = "P";
        }
        
        return color+type;
    }
}
