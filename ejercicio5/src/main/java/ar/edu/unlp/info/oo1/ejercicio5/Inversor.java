package ar.edu.unlp.info.oo1.ejercicio5;
import java.util.List;
import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
		
	}
	
	public void quitarInversion(Inversion i) {
	    this.inversiones.remove(i);
	}
	
	public double obtenerValorTotal() {

		double valorTotal = inversiones.stream()
			    .mapToDouble(inversion -> inversion.obtenerValorInversion())
			    .sum();
		//Por cada uno de los elementos de inversiones obtengo el valor de la inversion mientras lo sumo
		
		return valorTotal;
	}
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList <Inversion>();
		
	}
}
