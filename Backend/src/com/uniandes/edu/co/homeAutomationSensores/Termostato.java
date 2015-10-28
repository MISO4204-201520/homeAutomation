package com.uniandes.edu.co.homeAutomationSensores;
import com.uniandes.edu.co.homeAutomation.Sensor;

public class Termostato extends Sensor {
	
	private int temperatura;
	
	public Termostato(String id, int cuarto, boolean encendido, int temperatura) {
		super(id, cuarto, "termostato", encendido);
		this.temperatura = temperatura;
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
