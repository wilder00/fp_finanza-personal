package com.buscacode.finanzas_personales.controlador;

import com.buscacode.finanzas_personales.modelo.IngresoModel;

public class IngresoControlador {

	public void mostrarIngreso(IngresoModel ingreso) {
		String mensaje = "=================================================\n";
		mensaje = mensaje + "\t" + "Nombre del Ingreso: " + ingreso.nombreIngreso + "\n";
		mensaje = mensaje + "\t" + "Monto: " + ingreso.montoIngreso + "\n";
		mensaje = mensaje + "=================================================\n";
		
		System.out.println(mensaje);
		
	}
}
