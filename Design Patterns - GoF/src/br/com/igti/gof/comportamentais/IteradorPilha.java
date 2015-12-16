package br.com.igti.gof.comportamentais;

public class IteradorPilha extends Iterador {

	private Pilha pilha;
	
	public IteradorPilha(Pilha pilha) {
		this.pilha = pilha;
		super.indicarLista(pilha);
	}
	
	@Override
	public Integer proximoElemento() {
		if (!possuiMaisElementos()) {
			throw new RuntimeException("A pilha não possui mais elementos");
		}
		int tamanhoPilha = pilha.tamanho();
		int ultimoElemento = tamanhoPilha - 1;
		return pilha.remover(ultimoElemento);
	}

}
