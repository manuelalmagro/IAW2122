package ies.triana.poo05.main;

import ies.triana.poo05.bean.Alumno;
import ies.triana.poo05.dao.AlumnoDAO;
import ies.triana.poo05.dao.AlumnoDAOBD;
import ies.triana.poo05.dao.AlumnoDAOFichero;
import ies.triana.poo05.dao.AlumnoDAOListas;

public class Principal {
	
	public static void main(String[] args) {
		AlumnoDAO al = new AlumnoDAOListas();
		
		Alumno alum = new Alumno();
		
		al.anadir(null);
	}

}
