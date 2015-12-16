package br.com.igti.lod.ex1;

public class Autenticador {

	public boolean autenticar(Credencial c) {
		String usuario = c.getUsuario();
		String senha = c.getSenha();

		if (usuario.equals("usuario") && senha.equals("senha")) {
			return true;
		} else {
			return false;
		}
	}
}
