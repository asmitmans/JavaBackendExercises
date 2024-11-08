package cl.backendjava.clase07.banco;

import java.util.ArrayList;
import java.util.List;

public class CuentaAhorro extends Cuenta {
	
	private List<Transaction> depositos = new ArrayList<>();
	private static final double RENTABILIDAD = 0.02;
	
	public CuentaAhorro(int numero, double saldo) {
        super(numero, saldo);
    }
	
	@Override
	public void depositar(double monto) {
		setSaldo(getSaldo()+monto);
		Transaction transaction = new Transaction(monto, TipoTransaccion.ABONO);
		this.registrarTransaccion(transaction);
		addDeposito(transaction);
	}

	@Override
	public void actualizarSaldoMensual() {
		
		double suma5Depositos = depositos.stream()
				.mapToDouble(d->d.getMonto())
				.sum();
		
		setSaldo(getSaldo() + suma5Depositos * RENTABILIDAD);
	}
	
	@Override
	public void transferir(double monto, Cuenta cuentaDestino) {
		double penalizacion = monto * 0.05;
		double montoConPena = monto - penalizacion; 
		
		
		if (getSaldo() >= (monto)) {
			this.setSaldo(getSaldo()-monto);
			this.registrarTransaccion(new Transaction(-montoConPena, cuentaDestino, TipoTransaccion.CARGO ));
			this.registrarTransaccion(new Transaction(-penalizacion, TipoTransaccion.PENALIZACION ));
			cuentaDestino.recibirTransferencia(montoConPena, this);
		} else  {
			System.out.println("Saldo insuficiente para realizar esta operacion");
		}
	}
	
	public void addDeposito(Transaction transaction) {
		if (depositos.size() >= 5) {
			depositos.remove(0);
		}
		this.depositos.add(transaction);
	}
	
}
