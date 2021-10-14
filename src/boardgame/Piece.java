package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null;
		//Não é nescessario colocar o valor nulo. O java já coloca como padrão.
	}
	protected Board getBoard() {
		return board;
	}
	//Não quero que o tabuleiro seja acessivel por outras camadads
	
	
}
