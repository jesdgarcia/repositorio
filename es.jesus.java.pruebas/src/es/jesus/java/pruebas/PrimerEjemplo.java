package es.jesus.java.pruebas;

import java.util.Calendar;

public class PrimerEjemplo {
	public static void main(String args[]){
		System.out.println("Hola Jaime!");
		System.out.println("Escribe tu fecha de nacimiento:");
		System.out.print("D�a: ");
		int dia=Entrada.entero();
		System.out.print("Mes: ");
		String mes=Entrada.cadena();
		System.out.print("A�o: ");
		int anio=Entrada.entero();
		Calendar hoy = Calendar.getInstance();
		System.out.print("Que mayor, ya tienes "+(hoy.get(Calendar.YEAR)-anio)+" a�os.");
	}
}
