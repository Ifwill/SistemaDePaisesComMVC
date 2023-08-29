package dao;

import java.util.ArrayList;

import model.Paises;

public class PaisDAO {
	private ArrayList<Paises> listaDePaises;

	public PaisDAO() {
		listaDePaises = new ArrayList<Paises>();
	}

	public void adicionarPais(String nome, String capital) {
		Paises pais = new Paises(nome, capital);
		listaDePaises.add(pais);
	}

	/*
	 * metodo para remover um pais da lista, com o for para percorer a lista. o
	 * comando equalsIgnoreCase serve para ignorar se o usuario escrevel em
	 * maiusculo ou minusculo na hora da verificação.
	 */
	public boolean removerPais(String nome) {
		for (Paises i : this.listaDePaises) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				listaDePaises.remove(i);
				return true;
			}
		}
		return false;
	}

	public void limparLista() {
		listaDePaises.clear();
	}

	public ArrayList<Paises> exibirLista() {
		return listaDePaises;
	}

}
