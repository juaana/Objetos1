package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class Ticket{
		private  LocalDate fecha;
		private  List<Producto> Productos;
		private  double pesoTotal;
		private double precioTotal; 
		private int cantidadDeProductos;
		
		public Ticket(List<Producto> productos, double pesoTotal, double precioTotal, int cantidadTotal) {
		    this.fecha = LocalDate.now();
		    this.Productos = new ArrayList<Producto>(productos);
		    this.pesoTotal= pesoTotal;
		    this.precioTotal = precioTotal;
		    this.cantidadDeProductos = cantidadTotal;
		    
		}
	
		
		public List<Producto> getProductos() {
			return this.Productos;
			
		}
		
		public LocalDate getFecha() {
			return fecha;
		}


		public int getCantidadDeProductos() {
			return this.cantidadDeProductos;
		}


		public double getPesoTotal() {
			return pesoTotal;
		}


		public double getPrecioTotal() {
			return precioTotal;
		}


		public double impuesto() {
			double impuesto = this.precioTotal * 0.21;
			return impuesto;
		}
	 
		

}

		