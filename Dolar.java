package classes;

import java.util.Objects;

public class Dolar extends Moeda {
	
	// construtor para atribuir valor ao objeto
	public Dolar(double val) {
		super(val);
	}

	//Métodos
	@Override
	public void info() {
		System.out.println("Dolar: " + getValor());
		
	}
	double total = 0.0;
	@Override
	public double converter() {
		valor = getValor();
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 0;
		int result = super.hashCode();
		result = prime * result + Objects.hash(total);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}

}
