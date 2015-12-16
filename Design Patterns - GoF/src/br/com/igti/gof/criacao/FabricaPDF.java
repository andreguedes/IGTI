package br.com.igti.gof.criacao;

public class FabricaPDF extends FabricaDocumento<PDF> {

	@Override
	public PDF criarDocumento() {
		return new PDF();
	}
	
}
