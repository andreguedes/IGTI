package br.com.igti.ocp;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	private Integer codigo;
	private List<ProjetoFuncionario> funcionarios;

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public List<Funcionario> getFuncionariosProjeto() {
		List<Funcionario> funcionariosDoProjeto = new ArrayList<>();
		for (ProjetoFuncionario projFun : funcionarios) {
			funcionariosDoProjeto.add(projFun.getFuncionario());
		}
		return funcionariosDoProjeto;
	}

}
