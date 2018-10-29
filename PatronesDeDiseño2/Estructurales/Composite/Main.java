package Composite;

public class Main {

	public static void main(String[] args) {
		System.out.println("el valor del parcial es: ");
		AulaComposite componente1 = new Parcial(300);
		System.out.println(componente1.getCosto());
		
		AulaComposite componente2 = new Parcial(500);
		System.out.println("el valor del parcial dos es: ");
		System.out.println(componente2.getCosto());
		
		AulaComposite componente3 = new Curso();
		System.out.println("el curso tiene un valor de: ");
		System.out.println(componente3.getCosto());
		componente3.agregarExtra(componente1);
		componente3.agregarExtra(componente2);
		
		System.out.println("el curso tiene un costo de : ");
		System.out.println(componente3.getCosto());
	}

}
