package main;

import operations.*;

public class Main {
	public static void main(String[] args) {
		int[][] matrixOne = {{1, 2, 3},
		                  	 {4, 5, 6},
		                  	 {7, 8, 9}};
		
		ElementaryRowOperations ero = new ElementaryRowOperations(matrixOne);
		
		ero.displayMatrix();
		ero.scalarMultiplication(3, 2);
		ero.displayMatrix();
	}
}
