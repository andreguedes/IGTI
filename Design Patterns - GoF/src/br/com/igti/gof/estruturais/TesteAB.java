package br.com.igti.gof.estruturais;

public class TesteAB {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Lista lista = a.disponibilizarLista();
		b.consumirLista(lista);
	}
}
