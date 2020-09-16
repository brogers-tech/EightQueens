package main;


public class EightQueensMain {

	public static void printBoard(char board[][]) {
		System.out.println("   A  B  C  D  E  F  G  H");
		for(int row = 0; row < board.length; row++) {
			System.out.print((board.length - row) + " ");
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
	
	public static void removeQueen(char board[][], int row, int col) {
		board[row][col] = '\0';
	}
	
	public static boolean isAttacking(char board[][], int row, int col) {
		//horizontal check
		for(int c = 0; c != col; c++) {
			if(board[row][c] == 'Q' && c != col) {
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
	
	public static boolean solveEightQueens(char board[][], int col) {
		if(col >= board[0].length) {
			return true;
		}
		
		boolean solved = false;
		for(int row = 0; row < board.length; row++) {
			if(isAttacking(board, row, col)) {
				continue;
			}
			placeQueen(board, row, col);
			solved = solveEightQueens(board, col+1);
			if(!solved) {
				removeQueen(board, row, col);
			} else {
				break;
			}
		}
		
		return solved;
	}
	
	public static void main(String[] args) {
		char board[][] = new char[8][8];
		solveEightQueens(board, 0);
		System.out.println();
		printBoard(board);
	}

}
