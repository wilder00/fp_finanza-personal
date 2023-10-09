package com.buscacode.finanzas_personales.vista;

import java.util.Scanner;

public class MenuPrincipal {
	private static Scanner scanner = new Scanner(System.in);
	
	public static double pedirIngreso() {
		String inputUsuario = "";
		double montoIngreso = -1;
		System.out.println("Ingresar el monto de ingreso: ");
		inputUsuario = scanner.nextLine();
		
		try {
			montoIngreso = Double.parseDouble(inputUsuario);
			System.out.println("Ud. puso que tiene un ingreso de: " + montoIngreso);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Debe ingresar un valor numérico.");
		}
		return montoIngreso;
	}
	
	public static String pedirNombreDelIngreso() {
		String nombreIngreso = "";
		System.out.println("Ingresar el nombre del ingreso: ");
		nombreIngreso = scanner.nextLine();
		
		return nombreIngreso;
	}
}
