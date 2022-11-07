package classes;


import java.util.Scanner;

import classes.Cofrinho;


public class Main {

	public static void main(String[] args) {

	Cofrinho cofrinho = new Cofrinho();
	
	//Método Scaner para permitir a entrada de dados
    Scanner imput = new Scanner(System.in);
    
    //Menu inicial
    int opcao;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Moedas");
        System.out.println("2 - Remover Moedas");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Total de Moedas");
        System.out.println("5 - Encerrar");

        opcao = imput.nextInt();

        while(opcao != 5){
            switch(opcao){
                case 1:
                    cofrinho.adicionarMoeda();
                    break;
                case 2:
                    cofrinho.removerMoeda();
                    break;
                case 3:
                    cofrinho.listaMoedas();
                    break;
                case 4:
                    cofrinho.totalMoedas();
                    break;
                default:
                    System.out.println("Opção inválida, apenas as opções acima");
            }

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Moedas");
            System.out.println("2 - Remover Moedas");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total de Moedas");
            System.out.println("5 - Encerrar");

            opcao = imput.nextInt();
        }
        imput.close();
		

	}

}

@luanacoin
