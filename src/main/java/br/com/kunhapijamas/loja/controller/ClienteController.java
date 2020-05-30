package br.com.kunhapijamas.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

	@GetMapping(value="/cliente")
	public String novoFuncionario() {
		return "views/cadastros/clienteForm";		
	}
	
}
