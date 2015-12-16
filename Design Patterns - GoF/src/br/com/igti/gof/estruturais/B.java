package br.com.igti.gof.estruturais;

public class B {

	public void consumirLista(Lista lista) {
		for (int i = 0; i < lista.tamanho(); i++) {
			Integer valor = lista.consultar(i);

			System.out.println("Valor: " + valor);
		}
		lista.adiciona(10);
	}

}
