package br.com.igti.gof.comportamentais;

public abstract class Iterador {
	
	private Lista lista;
	
	public final boolean possuiMaisElementos() {
		if (lista == null) {
			throw new RuntimeException("Indique a lista antes do seu uso");
		}
		return lista.tamanho() > 0;
	}
	
	protected final void indicarLista(Lista lista) {
		this.lista = lista;
	}
	
	public abstract Integer proximoElemento();

}
