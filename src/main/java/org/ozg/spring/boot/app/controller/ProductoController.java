package org.ozg.spring.boot.app.controller;

import java.util.List;

import org.ozg.spring.boot.app.models.Producto;
import org.ozg.spring.boot.app.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
	
	@Autowired 
	private ProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> consltarProducto() {
		return productoService.consltarProducto();
	}

}
