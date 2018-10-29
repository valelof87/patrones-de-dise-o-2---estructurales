package Proxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(123, "valeria", 1000);
		
		ICuenta cuentaProxy = new CuentaProxy();
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 500);
		c = cuentaProxy.retirarDinero(c, 50);
		cuentaProxy.mostrarSaldo(c);
		

	}

}
