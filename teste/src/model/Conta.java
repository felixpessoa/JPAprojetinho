package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Conta {
	@Id
	private int numero;

	private double saldo;
	
	private double limite;

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	// CONSTRUTOR
	public Conta() {
		super();
	}

	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	// Metodos Get and Set
	public Integer getNumero() {
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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(limite);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numero;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(limite) != Double.doubleToLongBits(other.limite))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

}
