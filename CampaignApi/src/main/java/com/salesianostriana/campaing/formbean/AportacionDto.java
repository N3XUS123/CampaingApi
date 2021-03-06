package com.salesianostriana.campaing.formbean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class AportacionDto {

	private long id;
	private String dato;
	private double cantidad;
	private long idCampanya;
	private long idDatosMaestro;
	
	public AportacionDto(String dato, double cantidad, long idCampanya, long idDatosMaestro) {
		this.dato = dato;
		this.cantidad = cantidad;
		this.idCampanya = idCampanya;
		this.idDatosMaestro = idDatosMaestro;
	}

	public AportacionDto() {
		
	}
	
}
