package cl.backendjava.clase07.banco;

import java.time.LocalDate;

public class Transaction {
	private double monto;
	private LocalDate fecha;
	private Cuenta cuentaAsociada;
	private TipoTransaccion tipo;
	
	public Transaction(double monto, TipoTransaccion tipo) {
		this.monto = monto;
		this.fecha = LocalDate.now();
		this.tipo = tipo;
	}
	
	public Transaction(double monto, Cuenta cuentaAsociada, TipoTransaccion tipo) {
		this.monto = monto;
		this.fecha = LocalDate.now();
		this.cuentaAsociada = cuentaAsociada;
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cuenta getCuentaAsociada() {
		return cuentaAsociada;
	}

	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}

	public TipoTransaccion getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransaccion tipo) {
		this.tipo = tipo;
	}
	

}
