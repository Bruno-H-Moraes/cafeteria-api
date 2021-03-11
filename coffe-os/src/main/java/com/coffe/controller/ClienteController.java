package com.coffe.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffe.model.Cliente;


@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente ();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("11 94781-9350)");
		cliente1.setEmail("brhuadusidhasi");
		
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Taina");
		cliente2.setTelefone("11 xxxx-9350)");
		cliente2.setEmail("dsdsdsds");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
