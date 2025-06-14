package operations;

public class ElementaryRowOperations {
	public ElementaryRowOperations() {
		
	}
	
	public void RowSwap(int[][] matrix, int rowOne, int rowTwo) {
		int[] temp = matrix[rowOne-1];
		matrix[rowOne-1] = matrix[rowTwo-1];
		matrix[rowTwo-1] = temp;
	}
	
	public void displayMatrix(int[][] matrix) {
		System.out.println();
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				System.out.print(" " + matrix[row][col] + " "); 
			}
			System.out.println();
		}
	}
	
	public void displayMatrixRow(int[][] matrix, int row) {
		System.out.println();
		for(int i = 0; i < matrix[row].length; i++) {
			System.out.print(matrix[i] + " ");
		}
		System.out.println();
	}
}
