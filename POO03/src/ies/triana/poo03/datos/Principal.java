package ies.triana.poo03.datos;

public class Principal {
	
	public static void main(String[] args) {
		Asignatura iaw = new Asignatura(1);
		Asignatura bd = new Asignatura(2);
		Asignatura lm = new Asignatura(3);
		
		Alumnos juan = new Alumnos(iaw, bd, lm);
		
		Profesor p = new Profesor();
		p.ponerNotas(juan);
		System.out.println("La media del alumno es:" + calcularMedia(juan));
		
	}

	private static String calcularMedia(Alumnos juan) {
		// TODO Auto-generated method stub
		return null;
	}

}
