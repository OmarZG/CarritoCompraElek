package org.ozg.spring.boot.app.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DatosCliente implements Serializable {
	
	private static final long serialVersionUID = -5142135099252286527L;

	private Long  userId;
	
	private Long id;
	
	private String title;
	
	private String body;

}
