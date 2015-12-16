package br.com.igti.gof.estruturais;

public class ListaNaoAlteravel extends Lista {
	
	public ListaNaoAlteravel(Lista lista) {
		for(int i = 0; i < lista.tamanho(); i++)
			super.adiciona(lista.consultar(i));
	}
	
	@Override
	public void adiciona(Integer valor) {
		throw new RuntimeException("Não é permitido adicionar valor");
	}

	@Override
	public void remove(int indice) {
		throw new RuntimeException("Não é permitido remover valor");
	}
}
