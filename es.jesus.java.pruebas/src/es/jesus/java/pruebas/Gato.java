package es.jesus.java.pruebas;

public class Gato extends Animal{
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miaaaaauuuu";
	}

	public Gato(String nombre) {
		//0 indica animal de tierra
		super(0, nombre);
	}

}
