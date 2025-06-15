package operations;

public class ElementaryRowOperations {
	private int[][] matrix;
	
	public ElementaryRowOperations(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void RowSwap(int rowOne, int rowTwo) {
		int[] temp = matrix[rowOne-1];
		matrix[rowOne-1] = matrix[rowTwo-1];
		matrix[rowTwo-1] = temp;
	}
	
	public void scalarMultiplication(int row, int scalar) {
		for(int i = 0; i < matrix[row-1].length; i++) {
			matrix[row-1][i] *= scalar;
		}
	}
	
	public void addRows(int selectRow, int rowToBeAddedToSelectedRow, int scalar) {
		selectRow--;
		rowToBeAddedToSelectedRow--;
		for(int i = 0; i < matrix[selectRow].length; i++) {
			matrix[selectRow][i] += scalar * matrix[rowToBeAddedToSelectedRow][i];
		}
	}
	
	public void subtractRows(int selectRow, int rowToBeSubtractedToSelectedRow, int scalar) {
		selectRow--;
		rowToBeSubtractedToSelectedRow--;
		for(int i = 0; i < matrix[selectRow].length; i++) {
			matrix[selectRow][i] -= scalar * matrix[rowToBeSubtractedToSelectedRow][i];
		}
	}
	
	public void displayMatrix() {
		System.out.println();
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				System.out.print(" " + matrix[row][col] + " "); 
			}
			System.out.println();
		}
	}
	
	public void displayMatrixRow(int row) {
		System.out.println();
		for(int i = 0; i < matrix[row].length; i++) {
			System.out.print(matrix[i] + " ");
		}
		System.out.println();
	}
}
