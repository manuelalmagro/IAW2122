package ies.triana.ejercicios.datos;

import java.util.Scanner;

public class Ejercicio1 {

private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Por favor, elija un número positivo: ");
		int numero = sc.nextInt();
		if (numero >= 0 && numero <= 9) {
			System.out.println("Este número se compone de 1 número ");
		} else if (numero >= 10 && numero <=99) {
			System.out.println("Este número se compone de 2 números ");
		} else if (numero >= 100 && numero <= 999) {
			System.out.println("Este número se compone de 3 números ");
		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println("Este número se compone de 4 números ");
		} else if (numero < 0) {
			System.out.println("Este número es negativo, por favor elija otro número");
		}
	}
	
}
