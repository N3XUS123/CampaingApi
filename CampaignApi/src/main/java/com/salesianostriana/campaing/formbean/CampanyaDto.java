package com.salesianostriana.campaing.formbean;

import lombok.Data;

@Data
public class CampanyaDto {

	private long id;
	private String nombreCampanya;
	private String codigo;
	
	public CampanyaDto(String nombreCampanya, String codigo) {
		this.nombreCampanya = nombreCampanya;
		this.codigo = codigo;
	}	
	
}
