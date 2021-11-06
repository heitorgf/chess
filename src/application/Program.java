package application;

import rulechess.ChessMatch;
import rulechess.ChessPiece;
import rulechess.Chessposition;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	ChessMatch chessMatch = new ChessMatch();
	
	while(true) {
	UI.printBoard(chessMatch.getPieces());
	System.out.println();
	System.out.print("Source: ");
	Chessposition source = UI.readChessPosition(sc);
	System.out.println();
	System.out.print("Target: ");
	Chessposition target= UI.readChessPosition(sc);
	
	ChessPiece capturedPiece= chessMatch.performChessMove(source, target);
}
}
}