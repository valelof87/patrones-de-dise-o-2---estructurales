
public class AppAnimales {

	public static void main(String[] args) {
		AppAnimales tiendaDeMascotas = new AppAnimales();
		System.out.println("\n******************comprar Perro***************");
		tiendaDeMascotas.comprarPerro();
		System.out.println("**********************************\n");
		System.out.println("\n******************comprar Pajaro***************");
		tiendaDeMascotas.comprarPajaro();
		System.out.println("**********************************\n");
		System.out.println("\n******************comprar Gato***************");
		tiendaDeMascotas.comprarGato();
		System.out.println("**********************************\n");
	}

	private void comprarPerro() {
		Animal animal = new Perro();
		animal.color();
		animal.raza();
		animal.tamaño();
		animal.peso();

	}
	
	private void comprarPajaro() {
		Animal animal = new PajaroAdapter();
		animal.color();
		animal.raza();
		animal.tamaño();
		animal.peso();

	}
	
	private void comprarGato() {
		Animal animal = new Gato();
		animal.color();
		animal.raza();
		animal.tamaño();
		animal.peso();

	}
	
	
}
