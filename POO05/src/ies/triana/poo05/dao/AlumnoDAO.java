package ies.triana.poo05.dao;

import ies.triana.poo05.bean.Alumno;

public interface AlumnoDAO {

	public void anadir(Alumno a);
	
	public Alumno buscarPorNota(float nota);
	
	public Alumno buscarPorEdad(int edad);
	
	public void borrar(String nombre, String apellidos);
	
}
