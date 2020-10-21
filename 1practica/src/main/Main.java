package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int dim = 3, j = 0, i = 0;
		int[][]matrix = new int[3][3];
		
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
