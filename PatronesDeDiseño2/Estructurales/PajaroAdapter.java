
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
	public void tamaño() {
		System.out.println("seleccionando tamaño");
		
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
