package ies.triana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio5 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		int suma = 0;
		
		for (int i = numero; i < numero + 100; i++) {
			suma = suma + i;
		}
		
		/*int j = numero+ 1;
		while (j < numero + 100) {
			suma = suma + j;
			j++;
		}*/
		
		System.out.println("SUMA: " + suma);
		
		sc.close();
	}
	
}
