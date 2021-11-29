package ies.triana.examen.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	
private static Scanner sc = new Scanner(System.in);
private static int [] numero;
private static int [] numero2;

public static void main (String[] args) {
	int n = 0;
	do {
		System.out.println("Tamaño de Arrays: ");
		n = sc.nextInt();
	} while (n<0); {
		numero = new int[n];
		numero2 = new int[n];
		llenar();
		System.out.println(Arrays.toString(numero));
		System.out.println(Arrays.toString(numero2));
		cambioImparesPares();
		System.out.println(Arrays.toString(numero));
		System.out.println(Arrays.toString(numero2));
	}
}


private static void llenar() {
	for (int i = 0; i < numero.length; i++) {
		numero[i] = new Random().nextInt(50) + 1;
		numero2[i] = new Random().nextInt(50) + 1;
		
	}
	
}

private static void cambioImparesPares() {
	int num = 0;
	int num2 = 0;
	for (int i = 0; i < numero.length; i++) {
		num = numero[i];
		num2 = numero2[i];
			if (num%2 != 0) {
				numero[i] += 1;
			}
			if (num2%2 == 0) {
				numero2[i] += 1;
			}
	}
}
}
