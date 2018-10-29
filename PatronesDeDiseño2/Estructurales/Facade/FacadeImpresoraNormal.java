package Facade;

public class FacadeImpresoraNormal {
	 Impresora impresora;
	    
	    
	    public FacadeImpresoraNormal(String texto) {
	        super();
	        impresora= new Impresora();
	        impresora.setColor(true);
	        impresora.setHoja("A4");
	        impresora.setTipoDocumento("PDF");
	        impresora.setTexto(texto);
	    }


	    public void imprimir() {
	        
	        impresora.imprimirDocumento();
	    }
	    
	}


