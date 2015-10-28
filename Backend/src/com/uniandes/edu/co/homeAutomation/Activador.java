package com.uniandes.edu.co.homeAutomation;

public class Activador {
	private String id;
	private int cuarto;
	private String tipo;
	
	public Activador(String id, int cuarto, String tipo) {
		this.id = id;
		this.cuarto = cuarto;
		this.tipo = tipo;
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

	public void setCuarto(int cuarto) {
		this.cuarto = cuarto;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return id;
	}
}
