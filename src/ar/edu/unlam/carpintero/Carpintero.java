package ar.edu.unlam.carpintero;

public class Carpintero {

	private String nombreCarpintero;
	private Puerta puerta;
	
	public Carpintero(String nombreCarpintero) {
	this.nombreCarpintero = nombreCarpintero;
	}

	public Carpintero(String nombreCarpintero, String contraseņa1, String contraseņa2, String contraseņa3) {
		this.nombreCarpintero = nombreCarpintero;
		this.puerta = new Puerta(contraseņa1, contraseņa2, contraseņa3, null);
	}


	public String getNombreCarpintero() {
		return nombreCarpintero;
	}

	public void setNombreCarpintero(String nombreCarpintero) {
		this.nombreCarpintero = nombreCarpintero;
	}

	
}
