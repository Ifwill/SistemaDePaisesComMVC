package principal;

import java.util.Scanner;

import Controller.PaisesController;

public class Main {

	public static void main(String[] args) {
		int op = 0;
		Scanner lerDados = new Scanner(System.in);
		PaisesController paisesController = new PaisesController();

		do {
			op = paisesController.menu(lerDados);
			switch (op) {

			case 1:
				paisesController.adicionarPaises(lerDados);
				break;
			case 2:
				paisesController.exibirLista();
				break;
			case 3:
				paisesController.removerPaises(lerDados);
				break;
			case 4:
				paisesController.limparLista();
			}

		} while (op != 0);
		paisesController.saida();

	}

}
