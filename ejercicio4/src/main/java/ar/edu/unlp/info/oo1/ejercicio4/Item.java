package ar.edu.unlp.info.oo1.ejercicio4;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public String getDetalle() {
		return detalle;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	
	public double costo() {
		double costoTotal = this.getCantidad() * this.getCostoUnitario();
		return costoTotal;
	}
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad= cantidad;
		this.costoUnitario= costoUnitario;
	}
	
	
}
