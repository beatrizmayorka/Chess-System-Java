package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private  Color color;

	public ChessPiece(Board board, Color color) { // Constructor 
		super(board); // repassa a chamada para o construtor da super classe (Piece)
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}