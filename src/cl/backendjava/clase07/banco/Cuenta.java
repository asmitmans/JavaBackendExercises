package cl.backendjava.clase07.banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {
	private int numero;
	private double saldo;
	private List<Transaction> transactions = new ArrayList<>();
	
	public Cuenta() {
	}

	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
		
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", transactions=" + transactions + "]";
	}

	public void transferir(double monto, Cuenta cuentaDestino) {
		if (saldo >= monto) {
			this.saldo -= monto;
			this.registrarTransaccion(new Transaction(-monto, cuentaDestino, TipoTransaccion.CARGO ));
			cuentaDestino.recibirTransferencia(monto, this);
		} else  {
			System.out.println("Saldo insuficiente para realizar esta operacion");
		}
	}
	
	public void recibirTransferencia(double monto, Cuenta cuentaOrigen) {
		this.saldo += monto;
		this.registrarTransaccion(new Transaction(monto, cuentaOrigen, TipoTransaccion.ABONO));
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
		this.registrarTransaccion(new Transaction(monto, TipoTransaccion.ABONO));
	}
		
	public void registrarTransaccion(Transaction transaction) {
		if (transactions.size() >= 20) {
			transactions.remove(0);
		}
		this.transactions.add(transaction);
	}
	
	public abstract void actualizarSaldoMensual();

}
