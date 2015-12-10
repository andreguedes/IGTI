package br.com.igti.srp;

public class Endereco {

	private String rua;
	private String bairro;
	private Integer numero;
	private Cidade cidade;

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public Cidade getCidade() {
		return cidade;
	}
	
	class Cidade {
		
	}

}
