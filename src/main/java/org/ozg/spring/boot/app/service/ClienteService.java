package org.ozg.spring.boot.app.service;

import java.util.List;

import org.ozg.spring.boot.app.models.Cliente;

public interface ClienteService {
	
	List<Cliente> consltarClientes();
	
	Cliente crearCliente(Cliente cliente);
	
	Cliente modificarCliente(Cliente cliente);
	
	boolean eliminarCliente(Long id);

}
