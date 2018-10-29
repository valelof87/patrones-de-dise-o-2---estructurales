package Proxy;

import java.util.logging.Logger;

public class CuentaProxy implements ICuenta {
	private CuentaBanco cuentaReal;
	private final static Logger LOGGER =  Logger.getLogger(CuentaProxy.class.getName());
	
	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("****CuentaProxy****Retirar Dinero****");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBanco();
			return cuentaReal.retirarDinero(cuenta, monto);
		} else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		LOGGER.info("****CuentaProxy****Depositar Dinero****");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBanco();
			return cuentaReal.depositarDinero(cuenta, monto);
		} else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		LOGGER.info("****CuentaProxy****Mostrar Saldo****");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBanco();
			cuentaReal.mostrarSaldo(cuenta);
		} else {
			cuentaReal.mostrarSaldo(cuenta);
		}
		
	}
	

}
