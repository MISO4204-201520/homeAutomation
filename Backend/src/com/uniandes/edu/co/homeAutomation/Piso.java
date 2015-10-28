package com.uniandes.edu.co.homeAutomation;

import java.util.ArrayList;

public class Piso {
	private String id;
	private ArrayList<Cuarto> cuartos;
	
	public Piso(String id, ArrayList<Cuarto> cuartos) {
		this.id = id;
		this.cuartos = cuartos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Cuarto> getPisos() {
		return cuartos;
	}

	public void setPisos(ArrayList<Cuarto> cuartos) {
		this.cuartos = cuartos;
	}

	@Override
	public String toString() {
		return id;
	}
}
