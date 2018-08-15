package br.com.tiagodeveloper.servicos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagodeveloper.servicos.models.Servico;

@RestController
public class ServicoController {
	
	
	@GetMapping("/servicos")
	public Servico getServico(){
		return new Servico(1,"Primeiro", true);
	}
	@GetMapping("/tarefas")
	public String getTarefas(){
		return "Tarefas";
	}

}
