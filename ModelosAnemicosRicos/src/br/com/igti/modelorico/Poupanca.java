package br.com.igti.modelorico;

import java.util.Calendar;
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

	public boolean depositar(Float valor) {
		if (valor <= 0) {
			return false;
		}

		Float valorAtual = getSaldo();
		valorAtual = valorAtual + valor;
		setSaldo(valorAtual);

		criarHistorico(Operacao.DEPOSITO, valor);

		return true;
	}

	private void criarHistorico(Operacao operacao, Float valor) {
		Historico hist = new Historico();
		hist.setPoupanca(this);
		hist.setOperacao(operacao);
		hist.setData(Calendar.getInstance());
		hist.setValor(valor);

		historico.add(hist);
	}

	public boolean sacar(Float valor) {
		if (valor <= 0) {
			return false;
		}

		Float valorAtual = getSaldo();
		valorAtual = valorAtual + valor;
		setSaldo(valorAtual);

		criarHistorico(Operacao.SAQUE, valor);

		return true;
	}

}
