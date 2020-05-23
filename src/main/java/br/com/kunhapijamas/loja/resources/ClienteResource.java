package br.com.kunhapijamas.loja.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kunhapijamas.loja.domain.Cliente;
import br.com.kunhapijamas.loja.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService servise;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Cliente obj = servise.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
