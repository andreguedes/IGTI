package br.com.igti.gof.comportamentais;

import java.util.ArrayList;
import java.util.List;

public abstract class Lista {

	private List<Integer> listaInterna;
	
	public void adicionar(Integer valor) {
		iniciarListaSeNecessario();
		
		listaInterna.add(valor);
	}

	public Integer remover(int indice) {
		iniciarListaSeNecessario();
		
		return listaInterna.remove(indice);
	}
	
	public int tamanho() {
		iniciarListaSeNecessario();
		
		return listaInterna.size();
	}
	
	private void iniciarListaSeNecessario() {
		if (listaInterna == null) {
			listaInterna = new ArrayList<>();
		}
	}
	
	public abstract Iterador obterIterador();
	
}
