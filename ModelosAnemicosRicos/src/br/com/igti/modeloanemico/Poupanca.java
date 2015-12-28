package br.com.igti.modeloanemico;

import java.util.Collection;

public class Poupanca {

	private Float saldo;
	private Collection<Historico> historico;

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Collection<Historico> getHistorico() {
		return historico;
	}

}
