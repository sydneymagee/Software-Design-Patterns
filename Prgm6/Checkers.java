/**
 * This is the Checkers class.
 * 
 */
public class Checkers
{
    private GamePieceFactory pieceFactory;

    public Checkers(GamePieceFactory pieceFactory)
    {
        this.pieceFactory = pieceFactory;
    }
    public void play()
    {
        Piece piece0 = pieceFactory.createPiece("Black","");
        System.out.println(piece0);
        Piece piece1 = pieceFactory.createPiece("Red","");
        System.out.println(piece1);
    }
}
