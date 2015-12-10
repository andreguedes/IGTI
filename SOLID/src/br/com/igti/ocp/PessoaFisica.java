package br.com.igti.ocp;

public class PessoaFisica extends Funcionario {

	private String cpf;

	@Override
	public String getIdentificacao() {
		return cpf;
	}

	@Override
	public Float calcularImpostoRetido() {
		return getSalario() * 0.2F;
	}
	
}
