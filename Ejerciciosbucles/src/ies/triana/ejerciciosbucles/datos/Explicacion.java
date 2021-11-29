package ies.triana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// do while
		/*int numero;
		do {
			System.out.println("Nº Positivo: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		
		// while
		System.out.println("Nº Positivo: ");
		int numero2 = sc.nextInt();
		while (numero2 < 0) {
			System.out.println("Nº Positivo: ");
			numero2 = sc.nextInt();
		}*/
		
		// for
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		int i = 10, j = 10;
		while (i >= 1 && j >= 5) {
			System.out.println(i+ " " + j);
			i--;
			j--;
		}
		
		sc.close();
	}

}
