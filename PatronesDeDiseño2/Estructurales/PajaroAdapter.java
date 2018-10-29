
public class PajaroAdapter extends Animal{
	private Pajaro pajaro;
	
	public PajaroAdapter() {
		super();
		this.pajaro = new Pajaro();
		System.out.println("Comprando pajaro");
	}
	@Override
	public void raza() {
		System.out.println("seleccionando raza");
		this.pajaro.alas();
		this.pajaro.pico();
		this.pajaro.plumaje();
		
	}

	@Override
	public void tama�o() {
		System.out.println("seleccionando tama�o");
		
	}

	@Override
	public void peso() {
		System.out.println("seleccionando peso");
		
	}

	@Override
	public void color() {
		System.out.println("seleccionando color");
		
	}

}
