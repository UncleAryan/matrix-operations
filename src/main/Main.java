package main;

import operations.*;

public class Main {
	public static void main(String[] args) {
		int[][] matrixOne = {{1, 2}, 
							 {3, 4}};
		
		ElementaryRowOperations ero = new ElementaryRowOperations(matrixOne);
		
		ero.displayMatrix();
		ero.subtractRows(2, 1, 3);
		ero.displayMatrix();
	}
}
