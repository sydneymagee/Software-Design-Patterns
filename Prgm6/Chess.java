/**
 * This is the Chess class.
 * @author Sydney Magee
 * @version 9/11/2020
 */
public class Chess
{
    private GamePieceFactory pieceFactory;
    
    public Chess(GamePieceFactory pieceFactory)
    {
        this.pieceFactory = pieceFactory;
    }

    public void play()
    {
       Piece piece0 = pieceFactory.createPiece("black","Rook");
       System.out.println(piece0);
       Piece piece1 = pieceFactory.createPiece("white","Rook");
       System.out.println(piece1);
       Piece piece2 = pieceFactory.createPiece("black","Bishop");
       System.out.println(piece2);
       Piece piece3 = pieceFactory.createPiece("white","Bishop");
       System.out.println(piece3);
       Piece piece4 = pieceFactory.createPiece("black","knight");
       System.out.println(piece4);
       Piece piece5 = pieceFactory.createPiece("white","knight");
       System.out.println(piece5);
       Piece piece6 = pieceFactory.createPiece("black","Queen");
       System.out.println(piece6);
       Piece piece7 = pieceFactory.createPiece("white","Queen");
       System.out.println(piece7);
       Piece piece8 = pieceFactory.createPiece("black","King");
       System.out.println(piece8);
       Piece piece9 = pieceFactory.createPiece("white","King");
       System.out.println(piece9);
       Piece piecea = pieceFactory.createPiece("black","Pawn");
       System.out.println(piecea);
       Piece pieceb = pieceFactory.createPiece("white","Pawn");
       System.out.println(pieceb);
    }
}
