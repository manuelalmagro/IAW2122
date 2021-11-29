package ies.triana.poo03.datos;

public class Asignatura {
	private int identificador;
	private double calificador;
	public Asignatura(int identificador) {
		super();
		this.identificador = identificador;
	}
	
	
	public int getCalificador() {
		return (int) calificador;
	}


	public void setCalificador(float f) {
		this.calificador = f;
	}
	
	public int getidentificador() {
		return identificador;
	}
	
	@Override
	public String toString() {
		return "Asignatura [identificador=" + identificador + ", calificador=" + calificador + "]";
	}
	
	

}
