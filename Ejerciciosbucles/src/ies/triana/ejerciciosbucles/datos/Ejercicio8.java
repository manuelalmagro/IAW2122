package ies.triana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio8 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println();
		
		int numero1 = 0;
		int numero2 = 0;
		while (numero1 <= 10) {
			for (int i = 1;i <= 10; i++) {
				numero2 = numero1 * i;
				System.out.println(numero1 + "*" + numero2);
				
				for (int j = 1; j <= 10; j++) {
					System.out.println(numero1 + "*" + numero2);
				}
			}
			numero1++;
		}
		int tabla = 0;
		System.out.println("Intruzca un Nº: ");
		int i = 0;
		while (numero1 <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero1 + "*" + numero2);
			}
		}
		
		
	}
	
}
