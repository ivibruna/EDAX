package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int dim = 0, j = 0, i = 0;
		System.out.println("Diemsion de la matriz: ");
		dim = in.nextInt();
		int[][]matrix = new int[dim][dim];
		
		
		for(i = 0; i < dim; i++) {
			for(j = 0; j < dim; j++) {
				System.out.print("Posicion "+i+"/"+j+": ");
				matrix[i][j] = in.nextInt();
		
			}
		}
		
		System.out.println("---------");
		
		for(i = 0; i < dim; i++) {
			System.out.println();
			for(j = 0; j < dim; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

}
}
