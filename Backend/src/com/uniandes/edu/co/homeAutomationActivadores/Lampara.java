package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class Lampara extends Activador {
	
	private int intensidad;
	private boolean encendido;
	
	public Lampara(String id, int cuarto, int intensidad, boolean encendido) {
		
		super(id, cuarto, "lampara");
		
		this.intensidad = intensidad;
		this.encendido = encendido;
	}
	
	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
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
