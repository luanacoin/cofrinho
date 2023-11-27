package classes;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){ 

		// cria lista onde ficarão armazenados os valores de cada moeda
		ArrayList<Moeda> lista = new ArrayList<Moeda>();

		// menu interativo simples
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1 - adicionar moedas\n2 - remover moedas");

		// scanner para leitura
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		//seleção de operação do cofrinho
		switch(opt){
			case 1:
				adicionarMoeda(lista);
			break;
			case 2:
				removerMoeda(lista);
			break;
			default:
				System.out.println("Operação inexistente");
		}
	}

		// adiciona o objeto escolhido com seu dado valor
		public static void adicionarMoeda(ArrayList<Moeda> lista) {
			System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
			double val = 0.0;
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			
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
				}
			}

		// remove o objeto com dado valor	
		public static void removerMoeda(ArrayList<Moeda> lista) {
			System.out.println("Escolha a moeda\n1 - Real\n2 - Dolar\n3 - Euro");
			opt = sc.nextInt();
			System.out.println("Informe o valor: ");
			val = sc.nextDouble();

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
			}
		}
}