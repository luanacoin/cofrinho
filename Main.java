package classes;

import java.util.Objects;

public abstract class Moeda {
	//Atributos
	protected double valor;
	
	
	public Moeda(double val) {
		valor = val;
	}

	//Construtores
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

	//Métodos
	protected abstract void info();


	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	protected abstract double converter();




}
