package br.com.igti.modeloanemico;

import java.util.Calendar;
import java.util.Collection;

public class OperacaoContaPoupanca {

	private Poupanca poupanca;
	
	public boolean depositar(Float valor) {
		if (valor <= 0) {
			return false;
		}
		
		Float valorAtual = poupanca.getSaldo();
		valorAtual = valorAtual + valor;
		poupanca.setSaldo(valorAtual);
		
		Historico historico = new Historico();
		historico.setPoupanca(poupanca);
		historico.setOperacao(Operacao.DEPOSITO);
		historico.setData(Calendar.getInstance());
		historico.setValor(valor);
		
		Collection<Historico> hist = poupanca.getHistorico();
		hist.add(historico);
		
		return true;
	}
	
	public boolean sacar(Float valor) {
		if (valor <= 0) {
			return false;
		}
		
		Float valorAtual = poupanca.getSaldo();
		valorAtual = valorAtual + valor;
		poupanca.setSaldo(valorAtual);
		
		Historico historico = new Historico();
		historico.setPoupanca(poupanca);
		historico.setOperacao(Operacao.SAQUE);
		historico.setData(Calendar.getInstance());
		historico.setValor(valor);
		
		Collection<Historico> hist = poupanca.getHistorico();
		hist.add(historico);
		
		return true;
	}
	
}
