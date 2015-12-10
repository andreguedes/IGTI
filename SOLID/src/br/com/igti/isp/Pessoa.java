package br.com.igti.isp;

public class Pessoa implements Comparavel<Pessoa>, Copiavel<Pessoa> {

	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Pessoa copiar() {
		Pessoa p = new Pessoa();
		p.setNome(getNome());
		return p;
	}

	@Override
	public Integer comparar(Pessoa p) {
		return getNome().compareTo(p.getNome());
	}

}
