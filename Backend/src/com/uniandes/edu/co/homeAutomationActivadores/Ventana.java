package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class Ventana extends Activador {
	
	private boolean abierta;
	private boolean bloqueado;
	
	public Ventana(String id, int cuarto, boolean abierta, boolean bloqueado) {
		
		super(id, cuarto, "ventana");
		
		this.abierta = abierta;
		this.bloqueado = bloqueado;
	}
	
	public boolean getAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	public boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
}
