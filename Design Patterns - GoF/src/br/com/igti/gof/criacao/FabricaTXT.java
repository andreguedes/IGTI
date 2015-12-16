package br.com.igti.gof.criacao;

public class FabricaTXT extends FabricaDocumento<TXT> {

	@Override
	public TXT criarDocumento() {
		return new TXT();
	}
	
}
