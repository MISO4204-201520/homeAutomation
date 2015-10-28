package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class AccesoConHuella extends Activador {
	
	private int cuartoAdyacente;
	private boolean bloqueado;
	
	public AccesoConHuella(String id, int cuarto, int cuartoAdyacente, boolean bloqueado) {
		
		super(id, cuarto, "accesoHuella");
		
		this.cuartoAdyacente = cuartoAdyacente;
		this.bloqueado = bloqueado;
	}
	
	public int getCuartoAdyacente() {
		return cuartoAdyacente;
	}

	public void setCuartoAdyacente(int cuartoAdyacente) {
		this.cuartoAdyacente = cuartoAdyacente;
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
