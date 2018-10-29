package Flyweight;

import java.util.Random;

//CLIENTE
public class App {

	public static void main(String[] args) {
		// Obtenemos el n�mero de �rboles a dibujar por par�metro

		int num_arboles = Integer.valueOf(args[0]);

		// Definimos los tipos de �rbol

		String[] tipos = { "pino", "abeto", "sauce" };

		// Creamos la f�brica de �rboles

		FabricaDeArboles f = new FabricaDeArboles();

		// Crearemos tantos �rboles como se indiquen por par�metro

		// El tipo de �rbol ser� seleccionado aleatoriamente

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
