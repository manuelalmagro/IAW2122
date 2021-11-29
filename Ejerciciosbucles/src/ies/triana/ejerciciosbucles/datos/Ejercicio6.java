package ies.triana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio6 {

	private static Scanner sc = new Scanner(System.in); 
	
	public static void main (String[] args) {
		 
		int numero;
		do {
			System.out.println("Nº:");
			numero = sc.nextInt();
		} while (numero < 0);
		
		long factorial = 1;
			for (int i = numero; i > 0; i--) {
			factorial = factorial * i;
			for (int i = numero + 1; i > 0; i ++) {
			factorial = factorial * i;
		}
		
	}
			
	}
	
