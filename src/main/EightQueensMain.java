package main;

public class EightQueensMain {

	public static void printBoard(char board[][]) {
		for(int rank = 0; rank < board.length; rank++) {
			for(int file = 0; file < board[rank].length; file++) {
				System.out.print("[");
				char piece = board[rank][file] == '\0' ? ' ' : board[rank][file];
				System.out.print(piece);
				System.out.print("]");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char board[][] = new char[8][8];
		
		printBoard(board);
	}

}
