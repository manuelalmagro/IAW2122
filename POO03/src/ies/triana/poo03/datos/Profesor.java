package ies.triana.poo03.datos;

import java.util.Random;

public class Profesor {
	
	public void ponerNotas(Alumnos a) {
		a.getA1().setCalificador(new Random().nextFloat()*10);
		a.getA2().setCalificador(new Random().nextFloat()*10);
		a.getA3().setCalificador(new Random().nextFloat()*10);
		
	}
	
	public double calcularMedia(Alumnos a) {
		double cal1 = a.getA1().getCalificador();
		double cal2= a.getA1().getCalificador();
		double cal3= a.getA1().getCalificador();
		return (cal1 + cal2 + cal3) / 3;
	}

}
