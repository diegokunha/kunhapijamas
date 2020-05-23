package br.com.kunhapijamas.loja.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kunhapijamas.loja.domain.Cliente;
import br.com.kunhapijamas.loja.exception.ObjectNotFoundException;
import br.com.kunhapijamas.loja.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository gr;
	
	public Cliente find(long id) {
		Optional<Cliente> opt = gr.findById(id);
		return opt.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
