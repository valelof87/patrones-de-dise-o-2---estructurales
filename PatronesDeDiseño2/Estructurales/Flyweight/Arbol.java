package Flyweight;

//ESTE ES EL CONCRETE FLYWEIGHT
//DEFINE LAS CARACTERISTICAS INTRINSECAS DEL ARBOL.

public class Arbol implements IArbolLigero {
	 private String tipo;



     public Arbol( String tipo )

     {

             this.tipo = tipo;

     }
	
	@Override
	public String getTipo() {
		
		return tipo;
	}

	@Override
	public void dibujar(long x, long y, long z) {
		System.out.println("Árbol [" + this.getTipo() + "] dibujado en las coordenadas ("+x+", "+y+", "+z+")" );
		
	}

}
