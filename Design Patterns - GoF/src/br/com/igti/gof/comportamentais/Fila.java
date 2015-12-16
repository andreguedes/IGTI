package br.com.igti.gof.comportamentais;

public class Fila extends Lista {

	@Override
	public Iterador obterIterador() {
		return new IteradorFila(this);
	}

}
