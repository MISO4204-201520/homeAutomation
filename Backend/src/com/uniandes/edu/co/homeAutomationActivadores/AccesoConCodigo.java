package com.uniandes.edu.co.homeAutomationActivadores;

import com.uniandes.edu.co.homeAutomation.Activador;

public class AccesoConCodigo extends Activador {
	
	private int cuartoAdyacente;
	private String codigoAcceso;
	private boolean bloqueado;
	
	public AccesoConCodigo(String id, int cuarto, int cuartoAdyacente, String codigoAcceso, boolean bloqueado) {
		
		super(id, cuarto, "accesoCodigo");
		
		this.cuartoAdyacente = cuartoAdyacente;
		this.codigoAcceso = codigoAcceso;
		this.bloqueado = bloqueado;
	}
	
	public int getCuartoAdyacente() {
		return cuartoAdyacente;
	}

	public void setCuartoAdyacente(int cuartoAdyacente) {
		this.cuartoAdyacente = cuartoAdyacente;
	}
	
	public String getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
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
