package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numLinea = 1;
		int contador = 0;
		String[] texto = new String[numLinea];
		
		for(int i = 0; i < numLinea; i++) {
			texto[i] = in.nextLine();
		}
		
		for (int x=0;x<texto.length;x++)
			   System.out.println("Caracter " + x + ": " + texto.charAt(x));

	}

}
