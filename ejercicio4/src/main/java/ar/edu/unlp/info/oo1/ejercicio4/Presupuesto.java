package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item>items;
	
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double valorTotal = 0;
		for (Item i : this.items) {
			valorTotal += i.costo();
		}
		return valorTotal;
	}
	
	public String toString() {
		String mensaje =  this.fecha +" "+ this.cliente  ;
		return mensaje;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
	
}
