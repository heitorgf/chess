package rulechess;

import boardgame.Position;

public class Chessposition {
	private char column;
	private int row;

	public Chessposition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro iniciando Chessposition!");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	// matrix_row = 8 - chess_row
	// matrix_column = chess_column - 'a'
	// 'a' - 'a' = 0
	// 'b' - 'a' = 1

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static Chessposition fromPosition(Position position) {
		return new Chessposition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return " " + column + row;
	}
}
