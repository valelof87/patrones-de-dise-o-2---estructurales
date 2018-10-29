package Composite;


//CLASE HIJA
public class Parcial extends AulaComposite {
	private int costo;
	
	

	public Parcial(int costo) {
		this.costo = costo;
	}

	@Override
	public int getCosto() {
		
		return this.costo;
	}

	@Override
	public void agregarExtra(AulaComposite agregar) {
		// NO SE UTILIZA XQ ES PROPIO DEL COMPOSITE
		
	}

}
