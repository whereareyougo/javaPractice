package ConstructCode.FlyWeight;

public class Test {

	public static void main(String[] args) {
		PieceFactory pieceFactory = PieceFactory.getInstance();
		Piece piece = pieceFactory.getPiece("a");
		Piece piece2 = pieceFactory.getPiece("b");
		Piece piece3 = pieceFactory.getPiece("a");
		piece.display();
		piece2.display();
		piece3.display();
		System.out.println(piece == piece3);
		
	}

}
