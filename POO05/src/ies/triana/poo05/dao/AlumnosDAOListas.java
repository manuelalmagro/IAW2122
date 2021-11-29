package ies.triana.poo05.dao;

import java.util.ArrayList;
import java.util.List;

import ies.triana.poo05.bean.Alumno;

public class AlumnosDAOListas implements AlumnoDAO {
	
	private int [] numeros = new int[10];
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	@Override
	public void anadir(Alumno a) {
		alumnos.add(a);
		
	}

	@Override
	public Alumno buscarPorNota(float nota) {
		for (int i = 0; i < alumnos.size(); i++) {
			Alumno aux = alumnos.get(i);
			if (aux.getNota_expediente() == nota) {
				return aux;
			}
		}
		
		for (Alumno a : alumnos) {
			if (a.getNota_expediente() == nota) {
				return a;
			}
		}
		
		return null;
	}

	@Override
	public Alumno buscarPorEdad(int edad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(String nombre, String apellidos) {
		// TODO Auto-generated method stub
		
	}

}
