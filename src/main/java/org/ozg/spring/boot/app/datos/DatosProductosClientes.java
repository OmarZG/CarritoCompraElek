package org.ozg.spring.boot.app.datos;

import java.util.ArrayList;
import java.util.List;

import org.ozg.spring.boot.app.models.Cliente;
import org.ozg.spring.boot.app.models.Producto;
import org.springframework.stereotype.Component;

@Component
public class DatosProductosClientes {
	
	public DatosProductosClientes() {
		
		List<Producto> listProd = new ArrayList<>();
		
		Producto p1 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p2 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p3 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		Producto p4 = Producto.builder().id(1L).nombre("p1").descriptcion("p1").precio(200.30).build();
		
		listProd.add(p1);
		listProd.add(p2);
		listProd.add(p3);
		listProd.add(p4);
		
		List<Producto> list1 = new ArrayList<>();
		list1.add(p1);
		list1.add(p2);
		
		List<Producto> list2 = new ArrayList<>();
		list1.add(p3);
		list1.add(p4);
		
		Cliente c1 = Cliente.builder().id(1L).nombre("c1").productos(list1).build();
		Cliente c2 = Cliente.builder().id(1L).nombre("c1").productos(list2).build();

	}

}
