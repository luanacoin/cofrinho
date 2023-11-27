package classes;

import java.util.ArrayList;
import java.util.Scanner;

// funções que podem ser reformuladas na Main
public class Cofrinho {
	
	public void listaMoedas() {
		for(Moeda vm : lista) {
			vm.info();
		}
	}
	double total = 0.0;
	public void totalMoedas() {
		for(Moeda o : lista) {
			total += o.converter();
		}
		System.out.println("O total em real: " + total);
		 
	}
}
