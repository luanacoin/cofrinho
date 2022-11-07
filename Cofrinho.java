package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	
	
	ArrayList<Moeda> lista = new ArrayList<Moeda>();
	Scanner sc = new Scanner(System.in);
	
	int opt = 0;
	double val = 0.0;
	
	public void adicionarMoeda() {
		System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
		opt = sc.nextInt();
		
		switch (opt) {
			case 1: 
				System.out.println("Informe o valor: ");
				val = sc.nextDouble();
				lista.add(new Real(val));
				break;
			case 2:
				System.out.println("Informe o valor: ");
				val = sc.nextDouble();
				lista.add(new Dolar(val));
				break;
			case 3:
				System.out.println("Informe o valor: ");
				val = sc.nextDouble();
				lista.add(new Euro(val));
				break;
			default:
				System.out.println("Opção inválida - Apenas 1, 2 ou 3!");
				System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
				opt = sc.nextInt();
				
			
			}
		}
	 
	
	public void removerMoeda() {
		System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
		opt = sc.nextInt();

		switch (opt) {
			case 1:
				lista.remove(new Real(val));
				break;
			case 2:
				lista.remove(new Dolar(val));
				break;
			case 3:
				lista.remove(new Euro(val));
				break;
			default:
				System.out.println("Opção inválida - Apenas 1, 2 ou 3!");
				System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
				opt = sc.nextInt();
				System.out.println("Informe o valor: ");
				val = sc.nextDouble();
	
				
		}
	}
	
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
