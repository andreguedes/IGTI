package br.com.igti.gof.estruturais;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	private List<Integer> listaInterna;
	
	public Lista() {
		listaInterna = new ArrayList<>();
	}
	
	public void adiciona(Integer valor) {
		listaInterna.add(valor);
	}
	
	public void remove(int indice) {
		listaInterna.remove(indice);
	}
	
	public Integer consultar(int indice) {
		return listaInterna.get(indice);
	}
	
	public int tamanho() {
		return listaInterna.size();
	}
}
