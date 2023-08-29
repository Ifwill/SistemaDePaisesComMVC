package Controller;

import java.util.ArrayList;

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

	public void start() {
		int opcao = 0;
		do {
			switch (paisesView.menu()) {

			case 1:
				adicionarPaises();
				break;
			case 2:
				exibirLista();
				break;
			case 3:
				removerPaises();
				break;
			case 4:
				limparLista();
				break;
			}

		} while (opcao != 5);
		paisesView.saida();
	}

	public void adicionarPaises() {
		paisDao.adicionarPais(paisesView.getNome(), paisesView.getCapital());
	}

	public void removerPaises() {
		paisDao.removerPais(paisesView.getNome());
	}

	public void limparLista() {
		paisDao.limparLista();
	}

	public void exibirLista() {
		ArrayList<Paises> listaDePaises = paisDao.exibirLista();
		paisesView.exibirPaises(listaDePaises);
	}

	public int menu() {
		return paisesView.menu();
	}

}
