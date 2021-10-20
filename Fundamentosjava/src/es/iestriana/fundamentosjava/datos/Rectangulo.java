package es.iestriana.fundamentosjava.datos;

import java.util.Scanner;

public class Rectangulo {
	

	private static  Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Base Rectangulo: ");
		int base = sc.nextInt();
		
		System.out.println("Altura Rectangulo: ");
		int altura = sc.nextInt();
		
		int perimetro = 2 * (base + altura);
		int area = base * altura;
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		
		
	}
	
}
