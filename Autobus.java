package practica41;

import java.time.LocalDate;
import java.time.LocalTime;

public class Autobus {

	private String matricula;
	private String origenDestino;
	private LocalDate fecha;
	private LocalTime hora;
	private int numeroDeAsientos;
	private int asientosReservados;

	public Autobus(String matricula, String origenDestino, LocalDate fecha, LocalTime hora, int numeroDeAsientos) {

		this.matricula = matricula;
		this.origenDestino = origenDestino;
		this.fecha = fecha;
		this.hora = hora;
		this.numeroDeAsientos = numeroDeAsientos;
	}

	public void reservarAsiento() {
		this.asientosReservados += numeroDeAsientos;
	}

	public void cancelarAsiento() {
		this.asientosReservados -= numeroDeAsientos;

	}

	public int getNumeroDeAsientos() {
		return numeroDeAsientos;
	}

	public int getAsientosReservados() {
		return asientosReservados;
	}

	public void setNumeroDeAsientos(int numeroDeAsientos) {
		this.numeroDeAsientos = numeroDeAsientos;
	}
}