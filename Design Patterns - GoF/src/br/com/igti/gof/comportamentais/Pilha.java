package br.com.igti.gof.comportamentais;

public class Pilha extends Lista {

	@Override
	public Iterador obterIterador() {
		return new IteradorPilha(this);
	}

}
