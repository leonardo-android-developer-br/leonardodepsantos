package br.com.leonardodepsantos.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.leonardodepsantos.domain.Departamento;
import br.com.leonardodepsantos.service.DepartamentoService;


@Component
public class StringToDepartamento implements Converter<String, Departamento> {

	
		@Autowired
		private DepartamentoService service;
		
		@Override
		public Departamento convert(String text) {
			if(text.isEmpty()) {
			
				return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);

	}
}
