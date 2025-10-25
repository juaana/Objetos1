package ar.edu.unlp.info.oo1.ejercicio5;

public class InversionAcciones extends Inversion {

	private String nombreMerval;
	private int cantidad;
	private double valorUnitario;
	
	
	public double getCantidad() {
		return this.cantidad;
	}
	public String getNombreMerval() {
		return this.nombreMerval;
	}
	@Override
	public double obtenerValorInversion() {
		double valorInversion = this.valorUnitario * this.getCantidad();
		return valorInversion;
	}

	public InversionAcciones(String nombreMerval, int cantidad, double valorUnitario ){
		this.nombreMerval= nombreMerval;
		this.cantidad = cantidad; 
		this.valorUnitario= valorUnitario;
	}
}
