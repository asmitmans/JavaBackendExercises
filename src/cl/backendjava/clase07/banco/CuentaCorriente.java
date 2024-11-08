package cl.backendjava.clase07.banco;

public class CuentaCorriente extends Cuenta {
	
	private static double costoMantencion = 100;
	
	public CuentaCorriente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void actualizarSaldoMensual() {
		this.setSaldo(this.getSaldo() - costoMantencion);
	}
	
	@Override
	public void transferir(double monto, Cuenta cuentaDestino) {
		double montoConCosto = monto * 1.05;
		
		if (getSaldo() >= (montoConCosto)) {
			this.setSaldo(getSaldo()-montoConCosto);
			this.registrarTransaccion(new Transaction(-montoConCosto, cuentaDestino, TipoTransaccion.CARGO ));
			cuentaDestino.recibirTransferencia(monto, this);
		} else  {
			System.out.println("Saldo insuficiente para realizar esta operacion");
		}
	}
}
