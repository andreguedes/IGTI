package br.com.igti.gof.comportamentais;

public class IteradorFila extends Iterador {

	private Fila fila;
	
	public IteradorFila(Fila fila) {
		this.fila = fila;
		super.indicarLista(fila);
	}

	@Override
	public Integer proximoElemento() {
		if (!possuiMaisElementos()) {
			throw new RuntimeException("A fila não possui mais elementos");
		}
		return fila.remover(0);
	}

}
