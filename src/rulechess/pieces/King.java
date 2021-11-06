package rulechess.pieces;

import boardgame.Board;
import rulechess.ChessPiece;
import rulechess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "K";
	}
	
	
	
	
}
