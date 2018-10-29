package Proxy;

public class Cuenta {
	private int IDcuenta;
	private String usuario;
	private double saldoInicial;
	
	public Cuenta(int iDcuenta, String usuario, double saldoInicial) {
		super();
		IDcuenta = iDcuenta;
		this.usuario = usuario;
		this.saldoInicial = saldoInicial;
	}

	public int getIDcuenta() {
		return IDcuenta;
	}

	public void setIDcuenta(int iDcuenta) {
		IDcuenta = iDcuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	
	

}
