package org.ozg.spring.boot.app.service;

import java.util.List;

import org.ozg.spring.boot.app.models.Producto;

public interface ProductoService {
	
	List<Producto> consltarProducto();
	
	Producto consultarProductoProId(Long id);
	
	Producto crearProducto(Producto cliente);
	
	Producto modificarProducto(Producto cliente);
	
	boolean eliminarProducto(Long id);

}

