package com.softtek.modelo;

public enum TipoMovimiento {
	INGRESO(1),
	RETIRO(2);
	
	private int clave;
	
	private TipoMovimiento(int clave) {
		this.clave = clave;
	}

	public int getClave() {
		return clave;
	}

}
