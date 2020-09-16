package main;

public class EightQueensMain {

	public static void printBoard(char board[][]) {
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				System.out.print("[");
				char piece = board[row][col] == '\0' ? ' ' : board[row][col];
				System.out.print(piece);
				System.out.print("]");
			}
			System.out.println();
		}
	}
	
	public static void placeQueen(char board[][], int row, int col) {
		board[row][col] = 'Q';
	}
	
	public static void clearSpace(char board[][], int row, int col) {
		board[row][col] = '\0';
	}
	
	public static boolean isAttacking(char board[][], int row, int col) {
		//horizontal check
		for(int c = 0; c != col; c++) {
			if(board[row][c] == 'Q' && c != col) {
				System.out.println("Horizontal Check");
				return true;
			}
		}
		
		//diagonal checks
		
		//top left diagonal
		for(int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
			if(board[r][c] == 'Q') {
				return true;
			}
		}
		
		//bottom left diagonal
		for(int r = row + 1, c = col - 1; r < board.length && c >= 0; r++, c--) {
			if(board[r][c] == 'Q') {
				return true;
			}
		}
		
		return false;
	}
	
	public static void solveEightQueens(char board[][]) {
		
	}
	
	public static void main(String[] args) {
		char board[][] = new char[8][8];
		
		placeQueen(board, 3, 5);
		placeQueen(board, 0, 1);
		printBoard(board);
		System.out.println(isAttacking(board, 3, 5));
	}

}
