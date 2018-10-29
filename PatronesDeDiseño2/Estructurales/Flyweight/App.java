package Flyweight;

import java.util.Random;

//CLIENTE
public class App {

	public static void main(String[] args) {
		// Obtenemos el número de árboles a dibujar por parámetro

		int num_arboles = Integer.valueOf(args[0]);

		// Definimos los tipos de árbol

		String[] tipos = { "pino", "abeto", "sauce" };

		// Creamos la fábrica de Árboles

		FabricaDeArboles f = new FabricaDeArboles();

		// Crearemos tantos árboles como se indiquen por parámetro

		// El tipo de árbol será seleccionado aleatoriamente

		Random r = new Random(tipos.length),

				p = new Random();

		for (int i = 0; i < num_arboles  ; i++){

			f.getArbol(tipos[r.nextInt()])

					.dibujar(

							p.nextLong(),

							p.nextLong(),

							p.nextLong()

					);

		}

	}

}
