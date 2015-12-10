package br.com.igti.ocp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Funcionario {

	private String nomeFuncionario;
	private Date dataNascimento;
	private String matricula;
	private String telefone;
	private Float salario;
	private Endereco endereco;
	private List<ProjetoFuncionario> projetos;

	public abstract String getIdentificacao();
	public abstract Float calcularImpostoRetido();

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

	public Float getSalario() {
		return salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<ProjetoFuncionario> getProjetos() {
		return projetos;
	}

	public List<Projeto> getProjetosTrabalhados() {
		List<Projeto> projetosTrabalhados = new ArrayList<>();
		for (ProjetoFuncionario projFun : projetos) {
			projetosTrabalhados.add(projFun.getProjeto());
		}
		return projetosTrabalhados;
	}

}
