package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null;
		//N�o � nescessario colocar o valor nulo. O java j� coloca como padr�o.
	}
	protected Board getBoard() {
		return board;
	}
	//N�o quero que o tabuleiro seja acessivel por outras camadads
	public abstract boolean[][] possibleMoves();	
	
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	public boolean IsThereAnyPossibleMove() {
		boolean [][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
				return true;
				}
			}
		}
		return false;
	}
	
	
}
