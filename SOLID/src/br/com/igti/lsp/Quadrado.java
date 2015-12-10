package br.com.igti.lsp;

public class Quadrado extends Quadrilatero {

	@Override
	public void setAltura(Float altura) {
		ajustarLado(altura);
	}

	@Override
	public void setLargura(Float largura) {
		ajustarLado(largura);
	}

	private void ajustarLado(Float lado) {
		super.setLargura(lado);
		super.setAltura(lado);
	}

	@Override
	public Float getArea() {
		return super.getArea();
	}
}
