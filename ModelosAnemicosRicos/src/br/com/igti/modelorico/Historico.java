package br.com.igti.modelorico;

import java.util.Calendar;

public class Historico {

	private Poupanca poupanca;
	private Operacao operacao;
	private Calendar data;
	private Float valor;

	public void setPoupanca(Poupanca poupanca) {
		this.poupanca = poupanca;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

}
