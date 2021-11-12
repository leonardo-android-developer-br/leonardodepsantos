package br.com.leonardodepsantos.service;

import java.util.List;

import br.com.leonardodepsantos.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);
	
	void excluir(Long id);

	Funcionario buscarPorId(Long id);

	List<Funcionario> buscarTodos();

}
