package br.com.igti.ocp;

public class PessoaJuridica extends Funcionario {

	private String cnpj;

	@Override
	public String getIdentificacao() {
		return cnpj;
	}

	@Override
	public Float calcularImpostoRetido() {
		return getSalario() * 0.25F;
	}
	
}
