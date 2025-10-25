package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.*;

public class Balanza {
		
		private List<Producto> Productos;

		
		public void ponerEnCero(){
			this.Productos.clear();
		}
		
		
		public void agregarProducto(Producto producto) {
		    this.Productos.add(producto);
			
		}


		public int getCantidadDeProductos() {
			int cantidadDeProductos = this.Productos.size();
			return cantidadDeProductos;
		}


		public double getPrecioTotal() {
			double precioTotal = 0;
			for (Producto p : this.Productos) {
				precioTotal += p.getPrecio();
			}
			return precioTotal; 
		}


		public double getPesoTotal() {
			double pesoTotal = 0;
			for (Producto p : this.Productos) {
				pesoTotal += p.getPeso();
			}
			return pesoTotal; 
		}

		
		
		
		public List<Producto> getProductos() {
			return this.Productos;
			
		}


		public Balanza() {
		   this.Productos = new ArrayList<Producto>();
		}
		
		public Ticket emitirTicket() {
			
			double pesoTotal= this.getPesoTotal();
			double precioTotal= this.getPrecioTotal();
			int cantidadDeProductos = this.getCantidadDeProductos();
			List<Producto> productos = this.getProductos();
			
		    return new Ticket(productos ,pesoTotal, precioTotal, cantidadDeProductos);
		}

		
}