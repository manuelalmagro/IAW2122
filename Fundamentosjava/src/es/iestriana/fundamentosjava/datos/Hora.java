package es.iestriana.fundamentosjava.datos;

import java.util.Scanner;

public class Hora {

	private static  Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int totalsegundos = sc.nextInt();
		
        int horas = totalsegundos / 3600;
        int minutos = (totalsegundos - (horas * 3600)) / 60;
        int segundos = totalsegundos - (horas * 3600) - (minutos * 60);
        
        System.out.println("Horas: " + horas +
        		"\nMinutos: " + minutos +
        		"\nSegundos: " + segundos);
	}
	
}
