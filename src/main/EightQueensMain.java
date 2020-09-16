package main;

public class EightQueensMain {

	public static void printBoard(char board[][]) {
		for(int file = 0; file < board.length; file++) {
			for(int rank = 0; rank < board[file].length; rank++) {
				System.out.print("[");
				char piece = board[file][rank] == '\0' ? ' ' : board[file][rank];
				System.out.print(piece);
				System.out.print("]");
			}
			System.out.println();
		}
	}
	
	public static void placeQueen(char board[][], int rank, int file) {
		
	}
	
	public static void main(String[] args) {
		char board[][] = new char[8][8];
		
		printBoard(board);
	}

}
