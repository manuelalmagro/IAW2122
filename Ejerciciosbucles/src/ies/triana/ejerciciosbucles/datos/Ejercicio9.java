package ies.triana.ejerciciosbucles.datos;

import java.util.Scanner;

public class Ejercicio9 {

private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Nº: ");
		{
		   {		
		       int i = 0;
		       int num = 0;
		       num = sc.nextInt();
		       String  primos = "";

		       for (i = 1 ; i <= num; i++)         
		       { 		  	  
		          int contador = 0; 	  
		          for(num = i; num >= 1; num--)
			  {
		             if(i% num == 0)
			     {
		            	 contador = contador + 1;
			     }
			  }
			  if (contador == 2)
			  {
				  primos = primos + i + " ";
			  }	
		       }	
		       System.out.println("Nº primos :");
		       System.out.println(primos);
		   }
		}
		
	}
	
}
