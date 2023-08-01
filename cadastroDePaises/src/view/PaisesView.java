package view;

import java.util.List;

import model.Paises;

public class PaisesView {
	
	
	public void exibirPaises(List<Paises>paises) {
		System.out.println("------lista de paises-------");
		System.out.println("");
		
		for(Paises pais: paises) {
			System.out.println("Pais: "+pais.getNome()+"\nCapital: "+pais.getCapital());
			System.out.println("--------------------------");
		}
	}

}
