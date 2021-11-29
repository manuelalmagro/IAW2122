package ies.triana.poo03.datos;

public class Alumnos {
	
	private Asignatura a1;
	private Asignatura a2;
	private Asignatura a3;
	public Alumnos(Asignatura a1, Asignatura a2, Asignatura a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public Alumnos() {
		
	}
	
	public Alumnos(int m, int a, int d) {
		this.a1 = new Asignatura(m);
		this.a2 = new Asignatura(a);
		this.a3 = new Asignatura(d);
	}

	public Asignatura getA1() {
		return a1;
	}

	public Asignatura getA2() {
		return a2;
	}

	public Asignatura getA3() {
		return a3;
	}
	
	
	
	

}
