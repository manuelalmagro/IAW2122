package ies.triana.poo.main;

import ies.triana.poo04.datos.Coche;
import ies.triana.poo04.datos.Garaje;

public class Principal {
	
	public static void main(String[] args) {
		Coche c1 = new Coche("Ford", "Focus");
		
		Garaje g = new Garaje();
		
		if (g.aceptarCoche(c1, "frenos")) {
			System.out.println("Coche aceptado");
		} else {
			System.out.println("Coche denegado");
		}
		
		g.devolverCoche();
		
		if (g.aceptarCoche(c1, "aceite")) {
			System.out.println("Coche aceptado");
		} else {
			System.out.println("Coche denegado");
		}
	}

}
