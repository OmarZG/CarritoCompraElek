package org.ozg.spring.boot.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ozg.spring.boot.app.datos.DatosProductosClientes;
import org.ozg.spring.boot.app.models.Producto;
import org.ozg.spring.boot.app.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private DatosProductosClientes datosProductosClientes;

	@Override
	public List<Producto> consltarProducto() {
		log.info("----- consltarProducto ProductoServiceImpl -----");
		
        List<Producto> listProd = new ArrayList<>();
		
		Producto p1 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p2 = Producto.builder().id(2L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p3 = Producto.builder().id(3L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p4 = Producto.builder().id(4L).nombre("p1").descriptcion("p1").precio(200.30).build();
		
		listProd.add(p1);
		listProd.add(p2);
		listProd.add(p3);
		listProd.add(p4);
		
		return listProd;
	}

	@Override
	public Producto consultarProductoProId(Long id) {
        List<Producto> listProd = new ArrayList<>();
		
		Producto p1 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p2 = Producto.builder().id(2L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p3 = Producto.builder().id(3L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p4 = Producto.builder().id(4L).nombre("p1").descriptcion("p1").precio(200.30).build();
		
		listProd.add(p1);
		listProd.add(p2);
		listProd.add(p3);
		listProd.add(p4);
		
		return  Producto.builder().build();
	}

	@Override
	public Producto crearProducto(Producto cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto modificarProducto(Producto cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
		
}
