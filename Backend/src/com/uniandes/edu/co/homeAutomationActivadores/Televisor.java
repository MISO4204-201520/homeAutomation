package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class Televisor extends Activador {
	
	private boolean encendido;
	
	public Televisor(String id, int cuarto, boolean encendido) {
		
		super(id, cuarto, "televisor");
		
		this.encendido = encendido;
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
