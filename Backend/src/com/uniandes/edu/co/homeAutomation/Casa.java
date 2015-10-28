package com.uniandes.edu.co.homeAutomation;

import java.util.ArrayList;

public class Casa {
	private String id;
	private ArrayList<Piso> pisos;
	private ArrayList sensores;
	private ArrayList activadores;
	
	public Casa(String id, ArrayList<Piso> pisos) {
		this.id = id;
		this.pisos = pisos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Piso> getPisos() {
		return pisos;
	}

	public void setPisos(ArrayList<Piso> pisos) {
		this.pisos = pisos;
	}
	
	public ArrayList getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList sensores) {
		this.sensores = sensores;
	}
	
	public ArrayList getActivadores() {
		return activadores;
	}

	public void setActivadores(ArrayList activadores) {
		this.activadores = activadores;
	}

	@Override
	public String toString() {
		return "Casa [id=" + id + ", pisos=" + pisos.toString() + "]";
	}
}
