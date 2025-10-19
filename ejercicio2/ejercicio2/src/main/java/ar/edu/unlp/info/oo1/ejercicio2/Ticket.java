package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket{
		private  java.time.LocalDate fecha;
		private int cantidadDeProductos;
		private double pesoTotal;
		private double precioTotal;
		
		public Ticket(double peso, double precio, int cantidad) {
		    this.fecha = LocalDate.now();
		    this.cantidadDeProductos = cantidad;
		    this.pesoTotal = peso;
		    this.precioTotal = precio;
		}
		
		
		public java.time.LocalDate getFecha() {
			return fecha;
		}


		public int getCantidadDeProductos() {
			return cantidadDeProductos;
		}

		public void setCantidadDeProductos(int cantidadDeProductos) {
			this.cantidadDeProductos = cantidadDeProductos;
		}

		public double getPesoTotal() {
			return pesoTotal;
		}

		public void setPesoTotal(double pesoTotal) {
			this.pesoTotal = pesoTotal;
		}

		public double getPrecioTotal() {
			return precioTotal;
		}

		public void setPrecioTotal(double precioTotal) {
			this.precioTotal = precioTotal;
		}

		public double impuesto() {
			double impuesto = this.precioTotal * 0.21;
			return impuesto;
		}
		
		

}

		