package org.ozg.spring.boot.app.controller;

import java.util.Arrays;
import java.util.List;
import org.ozg.spring.boot.app.models.DatosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsultaClienteController {
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public ConsultaClienteController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/datos")
	public List<DatosCliente> getListClientes(){
		String url = "https://jsonplaceholder.typicode.com/posts";
		DatosCliente[] datosCliente = restTemplate.getForObject(url, DatosCliente[].class);
		return Arrays.asList(datosCliente);
	}
}
