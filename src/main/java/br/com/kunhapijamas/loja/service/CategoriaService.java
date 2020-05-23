package br.com.kunhapijamas.loja.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kunhapijamas.loja.domain.Categoria;
import br.com.kunhapijamas.loja.exception.ObjectNotFoundException;
import br.com.kunhapijamas.loja.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository gr;
	
	public Categoria find(long id) {
		Optional<Categoria> opt = gr.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
