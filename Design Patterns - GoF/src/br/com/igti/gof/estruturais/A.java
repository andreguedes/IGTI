package br.com.igti.gof.estruturais;

public class A {
	
	public Lista disponibilizarLista() {
		Lista lista = new Lista();
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adiciona(4);
		
		return new ListaNaoAlteravel(lista);
	}

}
