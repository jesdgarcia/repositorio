package es.jesus.java.pruebas;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal[] gato = {new Gato("Miko"), new Gato("Isidoro"), new Pajaro("Jeltrudis"), new Serpiente("Felisa")};
			int i=0;
			while(i<gato.length){
				System.out.println("Soy "+gato[i].nombre()+" un "+gato[i].getClass()+", "+gato[i].tipo()+". "+gato[i].sonido());
				i++;
			}
			
	}

}
