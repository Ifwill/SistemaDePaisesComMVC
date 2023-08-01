package Controller;

import java.util.ArrayList;
import java.util.List;

import model.Paises;
import view.PaisesView;

public class PaisesController {
	private ArrayList<Paises> listaDePaises;
	private PaisesView paisesView;
	
	public PaisesController() {
		listaDePaises = new ArrayList<Paises>();
		paisesView = new PaisesView();
	}
	
	public void adicionarPaises(String nome, String capital) {
		Paises pais = new Paises(nome,capital);
		listaDePaises.add(pais);
	}
	
	public void exibirListaDePaises() {
		paisesView.exibirPaises(listaDePaises);
	}
	

}
