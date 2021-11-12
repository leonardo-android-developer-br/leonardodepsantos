package br.com.leonardodepsantos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.leonardodepsantos.dao.FuncionarioDao;
import br.com.leonardodepsantos.domain.Funcionario;

@Transactional(readOnly = false)
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	
	@Autowired
	private FuncionarioDao dao;
	
	
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	
	
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional (readOnly = true)
	@Override
	public Funcionario buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Transactional (readOnly = true)
	@Override
	public List<Funcionario> buscarTodos() {
		
		return dao.findAll();
	}

	
}
	