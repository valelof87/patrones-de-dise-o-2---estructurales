package Facade;

public class Cliente {

	public static void main(String[] args) {
		FacadeImpresoraNormal fachada1= new FacadeImpresoraNormal("texto1");
	        fachada1.imprimir();
	        
	        FacadeImpresoraNormal fachada2= new FacadeImpresoraNormal("texto2");
	        fachada2.imprimir();
	        
	        
	        Impresora i3 = new Impresora();
	        i3.setHoja("a4");
	        i3.setColor(true);
	        i3.setTipoDocumento("excel");
	        i3.setTexto("texto 3");
	        i3.imprimirDocumento();
	    


	}

}
