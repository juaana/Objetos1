package ar.edu.unlp.info.oo1.ejercicio3;
public class Producto{
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	
	public Producto(String descripcion, double peso, double precioPorKilo) {
	    this.descripcion = descripcion;
	    this.peso = peso;
	    this.precioPorKilo = precioPorKilo;
	}
	
	public double getPeso() {
		
		return this.peso;
		
	}
	
	public void setPeso(double peso) {
		
		this.peso = peso;
		
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
	    return this.descripcion;
	}

	
	public double getPrecio() {
		double precioFinal = this.peso * this.precioPorKilo;
	
		return precioFinal;
	
	}
	

	
}