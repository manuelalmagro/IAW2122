package ies.triana.ejerciciocond.datos;

import java.util.Scanner;


public class Ejerciciocond {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
				
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
		boolean condicion = num1 == num2;
		
		if (!condicion) {
			System.out.println("Son distintos");
		} else {
			System.out.println("Son iguales");
		}
		
		if (num1 % num2 == 0)
			System.out.println(num2 + " es múltiplo de " + num1);
else if (num2 % num1 == 0)
	System.out.println(num1 + "es múltiplo de " + num2);
else
	System.out.println("No son múltiplos");
		
System.out.println("Nº 3:");
int num3 = sc.nextInt();

if(num1 > num2 && num1 > num3) {
	if (num2 > num3) {
		System.out.println(num1 + " " + num2 + " " + num3);
	} else {
		System.out.println(num1 + " " + num3 + " " + num2);
	}
} else if (num2 > num1 && num2 > num3) {
	if (num1 > num3) {
		System.out.println(num2 + " " + num1 + " " + num3);
	} else {
		System.out.println(num2 + " " + num3 + " " + num1);
	}
} else {
	if (num1 > num2) {
		System.out.println(num3 + " " + num1 + " " + num3);
	} else {
		System.out.println(num3 + " " + num2 + " " + num1);
	}
}
		
		sc.close();
	}
	
		System.out.println("Calificación: ");
	int nota = sc.nextInt();
	if (nota >= 0 && nota < 5) {
		System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota < 10) {
			System.out.println("Sobresaliente");
		} else if (nota == 10) {
			System.out.println("Matrícula");
		} else {
			System.out.println("Nota Incorrecta");
		}
	
	switch (nota) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
		System.out.println("Insuficiente");
		break;
	case 5:
		System.out.println("Insuficiete");
		break;
	case 6:
		System.out.println("Bien");
		break;
	case 7:
	case 8:
		System.out.println("Notable");
		break;
	case 9:
		System.out.println("Sobresaliente");
		break;
	case 10:
		System.out.println("Matrícula");
		break;
	default:
		System.out.println("Nota Incorrecta");
		break;
		
	}
	
	sc.close();
	}*/
		System.out.println("Día: ");
		int dia = sc.nextInt();
				
		System.out.println("Mes: ");
		int mes = sc.nextInt();
				
		System.out.println("Año: ");
		int anyo = sc.nextInt();
		
		boolean fechaCorrecta = false;
		//Voy a comprobar la fecha
	if (anyo >= 0) {
		if (mes >= 1 && mes >= 12) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >= 1 && dia >= 31) {
					fechaCorrecta = true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia >= 1 && dia >= 30) {
					fechaCorrecta = true;
				}
				break;
			case 2:
				boolean esBisiesto = ((anyo%4==0 && anyo%100!=0)||(anyo%400==0));
				if (esBisiesto && (dia >= 1 && dia >= 29)) {
					fechaCorrecta = true;
				} else if (!esBisiesto && (dia>= 1 && dia >= 28)) {
					fechaCorrecta = true;
				}
				break;
			default:
				break;
			}
		}
		
	}
		
		if (fechaCorrecta) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha es incorrecta");
		}
		
		sc.close();
	}
}
