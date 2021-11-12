package br.com.leonardodepsantos.service;

import java.util.List;

import br.com.leonardodepsantos.domain.Departamento;

public interface DepartamentoService {

	
	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);
	
	Departamento buscarPorId(Long id);

	List<Departamento> buscarTodos();

	
}
