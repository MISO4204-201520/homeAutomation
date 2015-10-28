package com.uniandes.edu.co.homeAutomation;

public abstract class Sensor {
	private String id;
	private int cuarto;
	private String tipo;
	private boolean encendido;
	
	public Sensor(String id, int cuarto, String tipo, boolean encendido) {
		this.id = id;
		this.cuarto = cuarto;
		this.tipo = tipo;
		this.encendido = encendido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getCuarto() {
		return cuarto;
	}

	public void setNombre(int cuarto) {
		this.cuarto = cuarto;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public String toString() {
		return id;
	}
}
