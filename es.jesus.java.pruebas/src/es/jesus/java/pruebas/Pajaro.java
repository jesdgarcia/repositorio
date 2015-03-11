package es.jesus.java.pruebas;

public class Pajaro extends Animal{
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Piopiopio";
	}

	public Pajaro(String nombre) {
		//1 indica animal volador
		super(1, nombre);
	}

}