package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import dao.PaisDAO;
import model.Paises;
import view.PaisesView;

public class PaisesController {
	private PaisesView paisesView;
	private PaisDAO paisDao;

	public PaisesController() {
		paisesView = new PaisesView();
		paisDao = new PaisDAO();
	}

	public void adicionarPaises(Scanner scanner) {
		String nome, capital;
		paisesView.opcaoP();
		nome = scanner.next();
		paisesView.opcaoC();
		capital = scanner.next();
		paisDao.adicionarPais(nome, capital);
	}

	public void removerPaises(Scanner scanner) {
		String nome;
		paisesView.opcaoP();
		nome = scanner.next();
		paisDao.removerPais(nome);
	}

	public void limparLista() {
		paisDao.limparLista();
	}

	public void exibirLista() {
		ArrayList<Paises> listaDePaises = paisDao.exibirLista();
		paisesView.exibirPaises(listaDePaises);

	}

	public int menu(Scanner scanner) {
		return paisesView.menu(scanner);
	}

	public void saida() {
		paisesView.saida();
	}

}
