package boardgame;

public class Piece {
	
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
	
	
}
