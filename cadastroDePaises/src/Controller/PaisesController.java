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
	
	public void adicionarPaises(String nome,String capital) {
		paisDao.adicionarPais(nome, capital);
	}
	
	public void removerPaises(String nome) {
		paisDao.removerPais(nome);
	}

	public void limparLista() {
		paisDao.limparLista();
	}
	
	public void exibirLista() {
		ArrayList<Paises> listaDePaises = paisDao.exibirLista();
		paisesView.exibirPaises(listaDePaises);

	}
	
	

}
