package Flyweight;

import java.util.HashMap;
import java.util.Map;

//se combina un Singleton con una Factor�a para lograr 
//proporcionar un punto de acceso �nico a la clase desde
//el cual se puedan reutilizar los elementos no redundantes. 

//FLYWEIGHT FACTORY

public class FabricaDeArboles {
	private Map arboles;



    public FabricaDeArboles(){
            this.arboles = new HashMap();

    }

    

    public IArbolLigero getArbol( String tipo ){

            // Si no tenemos ning�n �rbol del tipo solicitado, lo creamos

            if(!arboles.containsKey(tipo))

            {

                    arboles.put(tipo, new Arbol(tipo));

            }

            

            // Devolvemos el �rbol del tipo correspondiente

            return (IArbolLigero) arboles.get(tipo);

    }
}
