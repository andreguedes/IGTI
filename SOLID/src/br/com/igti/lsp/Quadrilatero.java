package br.com.igti.lsp;

public abstract class Quadrilatero {

	private Float altura;
	private Float largura;

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public void setLargura(Float largura) {
		this.largura = largura;
	}

	public Float getArea() {
		return altura * largura;
	}

}