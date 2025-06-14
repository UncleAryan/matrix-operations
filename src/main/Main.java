package main;

import operations.ElementaryRowOperations;

public class Main {
	public static void main(String[] args) {
		int[][] matrixOne = {{1, 2, 3},
		                  	 {4, 5, 6},
		                  	 {7, 8, 9}};
		
		ElementaryRowOperations ero = new ElementaryRowOperations();
		ero.displayMatrix(matrixOne);
		ero.RowSwap(matrixOne, 1, 3);
		ero.displayMatrix(matrixOne);
	}
}
