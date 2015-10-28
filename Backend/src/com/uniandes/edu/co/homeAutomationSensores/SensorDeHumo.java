package com.uniandes.edu.co.homeAutomationSensores;
import com.uniandes.edu.co.homeAutomation.Sensor;

public class SensorDeHumo extends Sensor {
	
	private boolean alarmando;
	
	public SensorDeHumo(String id, int cuarto, boolean encendido, boolean alarmando) {
		super(id, cuarto, "sensorHumo", encendido);
		this.alarmando = alarmando;
	}
	
	public boolean getAlarmando() {
		return alarmando;
	}

	public void setAlarmando(boolean alarmando) {
		this.alarmando = alarmando;
	}
}
