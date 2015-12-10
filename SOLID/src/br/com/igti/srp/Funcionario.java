package br.com.igti.srp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {

	private String nomeFuncionario;
	private Date dataNascimento;
	private String matricula;
	private String telefone;
	private Endereco endereco;
	private List<ProjetoFuncionario> projetos;

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Projeto> getProjetosTrabalhados() {
		List<Projeto> projetosTrabalhados = new ArrayList<>();
		for (ProjetoFuncionario projFun : projetos) {
			projetosTrabalhados.add(projFun.getProjeto());
		}
		return projetosTrabalhados;
	}

}
