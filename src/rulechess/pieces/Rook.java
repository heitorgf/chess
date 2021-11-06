package rulechess.pieces;

import boardgame.Board;
import rulechess.ChessPiece;
import rulechess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "R";
	}
}
