package classes;

import java.util.Objects;

public class Real extends Moeda {
	
	// construtor para atribuir valor ao objeto
	public Real(double val) {
		super(val);
	}
	
	//Métodos
	@Override
	public void info() {
		System.out.println("Real: " + getValor());
		}
		
	double total = 0.0;
	@Override

	// implementar conversão, até agora funciona como o getValor
	public double converter() {
		total = getValor();
		return total;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
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
		Real other = (Real) obj;
		return Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}

}
