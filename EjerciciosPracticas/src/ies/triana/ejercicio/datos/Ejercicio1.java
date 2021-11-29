package ies.triana.ejercicio.datos;

import java.util.Objects;

public class Ejercicio1 {
	
		
		private String nombre;
		private String cantante;
		private int duracion;
		private int ano;
		private String genero;
		private int reproducciones;
		private int calificacion;
		private boolean reproducir;
		@Override
		public String toString() {
			return "Ejercicio1 [nombre=" + nombre + ", cantante=" + cantante + ", duracion=" + duracion + ", ano=" + ano
					+ ", genero=" + genero + ", reproducciones=" + reproducciones + ", calificacion=" + calificacion
					+ ", reproducir=" + reproducir + "]";
		}
		public Ejercicio1(String nombre, String cantante, int duracion, int ano, String genero, int reproducciones,
				int calificacion, boolean reproducir) {
			super();
			this.nombre = nombre;
			this.cantante = cantante;
			this.duracion = duracion;
			this.ano = ano;
			this.genero = genero;
			this.reproducciones = 0;
			this.calificacion = 0;
			this.reproducir = true;
		}
	
	
	

}
