package br.com.kunhapijamas.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

	@GetMapping(value="/produto")
	public String novoFuncionario() {
		return "views/cadastros/produtoForm";		
	}
	
}
