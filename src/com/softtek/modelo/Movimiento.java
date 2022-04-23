package com.softtek.modelo;

public class Movimiento {
    private int id;
    private TipoMovimiento tipoMovimiento;
    private double cantidad;
    private String moneda;
    private String cuenta;
    
    
    
    
	@Override
	public String toString() {
		//Esto es un movimiento
		return "Movimiento [id=" + id + ", tipoMovimiento=" + tipoMovimiento + ", cantidad=" + cantidad + ", moneda="
				+ moneda + ", cuenta=" + cuenta + "]";
	}

	public Movimiento() {
		// TODO Auto-generated constructor stub
	}

	
	public Movimiento(int id, TipoMovimiento tipoMovimiento, double cantidad, String moneda, String cuenta) {
		super();
		this.id = id;
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
		this.moneda = moneda;
		this.cuenta = cuenta;
	}
	

	public Movimiento(TipoMovimiento tipoMovimiento, double cantidad, String cuenta) {
		super();
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
		this.cuenta = cuenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	
    
}
