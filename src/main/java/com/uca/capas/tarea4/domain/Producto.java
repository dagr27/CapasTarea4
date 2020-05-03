package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
/*Marca 100, desc 500, existencias entero, FechaIngreso dd/mm/yyyy*/
public class Producto {
	@NotEmpty
	@Size(min=1, max=12, message="El codigo debe contener entre 1 y 12 caracteres")
	private String codigo;
	
	@NotEmpty
	@Size(min=1, max=100, message="El nombre del producto debe ser minimo de 1 char, y maximo 100 char")
	private String nombre;
	
	@NotEmpty
	@Size(min=1, max=100, message="La marca debe de estar entre 1 y 100 caracteres")
	private String marca;
	
	@NotEmpty
	@Size(min=1,max=500,message="Debes poner una descripcion que este entre 1 y 500 caracteres")
	private String description;
	
	@Min(value=1, message="Debes poner como minimo 1")
	private Integer existencias;
	
	@NotEmpty
	@Pattern(regexp="([0-9]{2})([/])([0-9]{2})([/])([0-9]{4})", message="La fecha ingresada no cumple con el formato")
	private String fechaIngreso;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
	
	
}
