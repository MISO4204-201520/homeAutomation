package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class Ventilador extends Activador {
	
	private int velocidad;
	private boolean encendido;
	
	public Ventilador(String id, int cuarto, int velocidad, boolean encendido) {
		
		super(id, cuarto, "ventilador");
		
		this.velocidad = velocidad;
		this.encendido = encendido;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
}
