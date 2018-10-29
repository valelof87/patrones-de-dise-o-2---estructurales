package Composite;

import java.util.ArrayList;
import java.util.List;

//CLASE COMPOSITE
//DEFINE EL COSTO DEL CURSO

public class Curso extends AulaComposite {
	private int costo = 1000;
	private List<AulaComposite> listaAula;
	
	public Curso() {
		listaAula = new ArrayList<AulaComposite>();
	}
	
	@Override
	public int getCosto() {
	
		return this.costo;
	}

	@Override
	public void agregarExtra(AulaComposite agregar) {
		this.costo = this.costo + agregar.getCosto();
		this.listaAula.add(agregar);
	}

}
