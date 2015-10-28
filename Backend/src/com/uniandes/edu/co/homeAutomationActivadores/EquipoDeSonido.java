package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class EquipoDeSonido extends Activador {
	
	private int volumen;
	private boolean encendido;
	
	public EquipoDeSonido(String id, int cuarto, int volumen, boolean encendido) {
		
		super(id, cuarto, "equipoDeSonido");
		
		this.volumen = volumen;
		this.encendido = encendido;
	}
	
	public boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
}
