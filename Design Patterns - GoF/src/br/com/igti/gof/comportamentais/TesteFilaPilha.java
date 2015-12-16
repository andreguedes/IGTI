package br.com.igti.gof.comportamentais;

public class TesteFilaPilha {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();

		fila.adicionar(10);
		fila.adicionar(20);
		fila.adicionar(30);
		fila.adicionar(40);

		pilha.adicionar(10);
		pilha.adicionar(20);
		pilha.adicionar(30);
		pilha.adicionar(40);

		System.out.println("Valores inseridos na fila: ");
		Iterador iteradorFila = fila.obterIterador();
		while (iteradorFila.possuiMaisElementos()) {
			Integer valor = iteradorFila.proximoElemento();
			System.out.println("Valor: " + valor);
		}

		System.out.println("Valores inseridos na pilha: ");
		Iterador iteradorPilha = pilha.obterIterador();
		while (iteradorPilha.possuiMaisElementos()) {
			Integer valor = iteradorPilha.proximoElemento();
			System.out.println("Valor: " + valor);
		}

		iteradorPilha.proximoElemento();
	}

}
