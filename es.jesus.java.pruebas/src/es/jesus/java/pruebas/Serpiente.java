package es.jesus.java.pruebas;

public class Serpiente extends Animal{
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Szsszszszsz";
	}

	public Serpiente(String nombre) {
		//0 indica animal de tierra
		super(0, nombre);
	}

}