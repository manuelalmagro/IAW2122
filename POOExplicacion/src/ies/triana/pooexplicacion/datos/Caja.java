package ies.triana.pooexplicacion.datos;

import java.util.Objects;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class Caja {
	
	// Atributos
	private double ancho;
	private double alto;
	private double largo;
	
	// Constructores
	public Caja() {
		
	}
	
	public Caja(double ancho, double alto, double largo) {
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

	public Caja(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	
	// Métodos Get y Set
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
	}
	
	
	// Métodos
	public double obtenerVolumen() {
		return (ancho * largo * alto);
	}
	
	public boolean equals (Caja aux) {
		if (this.ancho == aux.ancho && this.alto == aux.alto && this.largo == aux.largo) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho, largo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caja other = (Caja) obj;
		return Double.doubleToLongBits(alto) == Double.doubleToLongBits(other.alto)
				&& Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho)
				&& Double.doubleToLongBits(largo) == Double.doubleToLongBits(other.largo);
	}
	
	

}
