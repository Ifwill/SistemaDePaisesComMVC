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
	
	/* metodo para remover um pais da lista, com o for para percorer a lista.
	 * o comando equalsIgnoreCase serve para iguinorar se o usuario escrevel 
	 * em maiusculo ou minusculo na hora da verificação.
	 */
	public boolean removerPaises(String nome) {
		for(Paises i:this.listaDePaises) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				listaDePaises.remove(i);
				System.out.println();
				System.out.println("Pais removido!!");
				return true ;
			}
		}
		System.out.println("");
		System.out.println("Pais nao encontrado!!");
		return false;
	}
	
	public void limparLista() {
		listaDePaises.clear();
		System.out.println("lista limpa!!");
	}
	
	public void exibirListaDePaises() {
		paisesView.exibirPaises(listaDePaises);
	}
	

}
