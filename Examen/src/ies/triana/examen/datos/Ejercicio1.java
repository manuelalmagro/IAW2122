package ies.triana.examen.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int [] numero;
	private static int [] numero2;
	
	public static void main(String[] args) {
			int n = 0;
			do {
				System.out.println("Tamaño del array: ");
				n = sc.nextInt();
			} while (n<0);
			numero = new int[n];
			numero2 = new int[n];
			llenarTabla();
			System.out.println(Arrays.toString(numero));
			repes();
			System.out.println(Arrays.toString(numero2));
	}

	private static void repes() {
		int cont = 0;
		int num = 0;
		
		for (int i = 0; i < numero.length; i++) {
			num = numero[i];
				for (int j = 0; j < numero.length; j++) {
					if (num == numero[j]) {
						cont++;
					}
				}
				if (cont > 1) {
					cont = 0;
				}else if (cont <= 1) {
					numero2[i] = num;
					cont = 0;
				}
		}
		
	}

	private static void llenarTabla() {
		for (int i = 0; i < numero.length; i++) {
			numero[i] = new Random().nextInt(15) + 1;
		}
	}

}
