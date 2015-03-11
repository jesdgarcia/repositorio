package es.jesus.java.pruebas;

public abstract class Animal {

	private String tipo;
	private String nombre;
	

	public Animal(int tipo, String nombre) {
		String[] tipos = new String[] {"terrestre","volador","acuatico"};
		this.tipo = tipos[tipo];
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	public String tipo() {
		return tipo;
	}
	
	public String nombre(){
		return nombre;
	}
	
	public abstract String sonido();
}
