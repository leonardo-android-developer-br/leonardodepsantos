package br.com.leonardodepsantos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.leonardodepsantos.dao.CargoDao;
import br.com.leonardodepsantos.domain.Cargo;

public class CargoServiceImpl implements CargoService {

	
	@Autowired
	private CargoDao dao;
	
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Cargo buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override
	public List<Cargo> buscarTodos(){
		
		return dao.findAll();
	}
	
}	

	
	
	
	


