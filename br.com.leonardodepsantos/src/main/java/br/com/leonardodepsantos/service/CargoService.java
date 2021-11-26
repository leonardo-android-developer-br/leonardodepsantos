package br.com.leonardodepsantos.service;

import java.util.List;

import br.com.leonardodepsantos.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);
	
	void excluir(Long id);

	Cargo buscarPorId(Long id);

	List<Cargo> buscarTodos();

	boolean cargoTemFuncionario(Long id);

	

}
