package com.softtek.presentacion;

import java.sql.SQLException;
import java.util.Scanner;

import com.softtek.modelo.Movimiento;
import com.softtek.modelo.TipoMovimiento;
import com.softtek.repositorio.AccesoNorthwind;

public class ProbarMovimiento {

	private static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {
		String opcion = null;
		int op = 0;
		while (true) {
			while (true) {
				// Menu
				System.out.println("-".repeat(50));
				System.out.println("------ OPCIONES DEL CAJERO -----");
				System.out.println("1) Ingresar un monto de dinero en una cuenta");
				System.out.println("2) Retirar un monto de dinero en una cuenta");
				System.out.println("3) Finalizar");
				System.out.println("-".repeat(50));
				// Validación
				System.out.println("Escriba la opción --> ");
				opcion = consola.next();
				// línea sensible a error
				try {
					op = Integer.parseInt(opcion);
				} catch (NumberFormatException ex) {
					continue;
				}
				if (op > 0 && op < 4) {
					break;
				}
			}
			switch (op) {
			case 1, 2:
				crearMovimiento(op);
				break;
			}
			if (op == 3) {
				break;
			}
		}

	}

	private static void crearMovimiento(int op) {
		// TODO Auto-generated method stub
		Movimiento m1 = solicitaDatos(op);
		System.out.println("*".repeat(50));
		AccesoNorthwind a1 = new AccesoNorthwind();
		try {
			System.out.println("El número de movimiento de su transaccion es -> "+ a1.ejecutarProc(m1));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		System.out.println("*".repeat(50));
	}

	private static Movimiento solicitaDatos(int op) {
		String cuenta;
		double cantidad;
		TipoMovimiento tipo;
		if (TipoMovimiento.INGRESO.getClave() == op) {
			tipo = TipoMovimiento.INGRESO;
		} else {
			tipo = TipoMovimiento.RETIRO;
		}
		System.out.println("Escriba su cuenta -->");
		cuenta = consola.next();
		System.out.printf("Escriba la cantidad para el %s -->", tipo.toString());
		cantidad = consola.nextDouble();
		return new Movimiento(tipo, cantidad, cuenta);
	}

}
