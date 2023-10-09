package com.buscacode.finanzas_personales;

import com.buscacode.finanzas_personales.controlador.IngresoControlador;
import com.buscacode.finanzas_personales.modelo.IngresoModel;
import com.buscacode.finanzas_personales.vista.MenuPrincipal;

public class MainApp {
	
	public static IngresoControlador ingresoControlador = new IngresoControlador();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreIngreso = MenuPrincipal.pedirNombreDelIngreso();
		double montoIngreso = MenuPrincipal.pedirIngreso();
		
		IngresoModel ingreso = new IngresoModel(montoIngreso, nombreIngreso);
		
		ingresoControlador.mostrarIngreso(ingreso);
	}

}
