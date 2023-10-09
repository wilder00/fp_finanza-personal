package com.buscacode.finanzas_personales.modelo;

public class IngresoModel {
	public double montoIngreso;
	public String nombreIngreso;
	
	public IngresoModel(){
		this.montoIngreso = 0;
		this.nombreIngreso = "Sin Nombre";
	}
	public IngresoModel (double montoIngreso, String nombreIngreso) {
		this.montoIngreso = montoIngreso;
		this.nombreIngreso = nombreIngreso;
	}
}
