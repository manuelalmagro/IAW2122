package ies.triana.poo05.bean;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	private String nombre;
	private String apellido;
	private int edad;
	private float nota_expediente;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String apellido, int edad, float nota_expediente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nota_expediente = nota_expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getNota_expediente() {
		return nota_expediente;
	}

	public void setNota_expediente(float nota_expediente) {
		this.nota_expediente = nota_expediente;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nota_expediente="
				+ nota_expediente + "]";
	}

}
