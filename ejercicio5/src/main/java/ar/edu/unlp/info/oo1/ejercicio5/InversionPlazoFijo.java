package ar.edu.unlp.info.oo1.ejercicio5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class InversionPlazoFijo extends Inversion{
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajeInteres;
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public double getMontoDepositado() {
		return montoDepositado;
	}
	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}
	
	@Override
	public double obtenerValorInversion() {
		double cantDias = ChronoUnit.DAYS.between(this.getFecha(), LocalDate.now());
		double valorInversion = this.getMontoDepositado() + (cantDias * this.getPorcentajeInteres());
		return valorInversion;
	}
	
	public InversionPlazoFijo(double montoDepositado, double porcentajeIntereses) {
		this.fecha = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeInteres= porcentajeIntereses;
	}
	
	
}
