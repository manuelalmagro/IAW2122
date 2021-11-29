package ies.triana.poo01.datos;

import java.util.Objects;

public class Cuenta {
	
	private String nombre;
	private String ccc;
	private double saldo;
	private double tipoDeinteres;
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuenta(String nombre, String ccc, double saldo, double tipoDeinteres) {
		super();
		this.nombre = nombre;
		this.ccc = ccc;
		this.saldo = saldo;
		this.tipoDeinteres = tipoDeinteres;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCcc() {
		return ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoDeinteres() {
		return tipoDeinteres;
	}
	public void setTipoDeinteres(double tipoDeinteres) {
		this.tipoDeinteres = tipoDeinteres;
	}
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", ccc=" + ccc + ", saldo=" + saldo + ", tipoDeinteres=" + tipoDeinteres
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ccc, nombre, saldo, tipoDeinteres);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(ccc, other.ccc) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Double.doubleToLongBits(tipoDeinteres) == Double.doubleToLongBits(other.tipoDeinteres);
	}
	
	public void ingresar (double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		}
	}
	
	public void reintegro(double cantidad) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo = saldo - cantidad;
		}
	}

}
