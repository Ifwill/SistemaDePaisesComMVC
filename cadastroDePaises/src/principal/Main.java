package principal;

import java.util.Scanner;

import Controller.PaisesController;

public class Main {
	
	public static void exibirMenu() {
		System.out.println("--------menu-------");
		System.out.println("1-Adicionar pais.");
		System.out.println("2-Listar paises.");
		System.out.println("3-Sair.");
	}

	public static void main(String[] args) {
		int escolhaMenu = 0;
		String nomePais, capitalDoPais;
		
		Scanner lerDados = new Scanner(System.in);
		
		PaisesController paisesController = new PaisesController();
		
		
		do {
			
		exibirMenu();
		System.out.println();
		System.out.println("Digite sua escolha: ");
		System.out.println("-------------------");
		escolhaMenu = lerDados.nextInt();
		switch (escolhaMenu) {
		
		case 1:
			System.out.println("escolha um pais que vc deseja add: ");
			nomePais = lerDados.next();
			System.out.println("Capital do pais: ");
			capitalDoPais = lerDados.next();
			paisesController.adicionarPaises(nomePais,capitalDoPais);
			break;
		case 2:
			paisesController.exibirListaDePaises();
			
		}
			
		}while(escolhaMenu != 3);
		
		System.err.println("saindo....");
		
		
		

	}

}
