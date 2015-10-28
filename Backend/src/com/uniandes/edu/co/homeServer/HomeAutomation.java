package com.uniandes.edu.co.homeServer;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.google.gson.Gson;
import com.uniandes.edu.co.homeAutomation.Casa;
import com.uniandes.edu.co.homeAutomation.Cuarto;
import com.uniandes.edu.co.homeAutomation.Piso;
import com.uniandes.edu.co.homeAutomation.Sensor;
import com.uniandes.edu.co.homeAutomationActivadores.*;
import com.uniandes.edu.co.homeAutomationSensores.*;
 
@Path("home")
public class HomeAutomation {
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() throws JsonGenerationException, JsonMappingException, IOException {
    	
    	// Crear los cuartos
    	ArrayList<Cuarto> cuartos = new ArrayList<Cuarto>();
    	cuartos.add(new Cuarto(1, "Cuarto de Nicolas", "Alcohoba"));
    	cuartos.add(new Cuarto(2, "Baño de Nathalia", "Baño"));
    	
    	ArrayList<Cuarto> cuartos2 = new ArrayList<Cuarto>();
    	cuartos2.add(new Cuarto(3, "Cuarto de Nathalia", "Alcohoba"));
    	cuartos2.add(new Cuarto(4, "Cocina", "Cocina"));
    	
    	// Crear los pisos
    	ArrayList<Piso> pisos = new ArrayList<Piso>();
    	pisos.add(new Piso("1", cuartos));
    	pisos.add(new Piso("2", cuartos2));
    	
    	// Creando los sensores
    	ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    	sensores.add( new SensorDeHumo("Sensor de humo Nicolas", 3, true, true) );
    	sensores.add( new SensorDeMovimiento("Sensor de movimiento nathalia", 1, true, false) );
    	sensores.add( new Termostato("Termostato", 4, true, 40) );
    	
    	// Creando los activadores
    	ArrayList activadores = new ArrayList();
    	activadores.add( new AccesoConCodigo("Pinpad", 3, 4, "1234", false) );
    	activadores.add( new AccesoConCodigo("Pinpad 2", 4, 3, "4321", false) );
    	activadores.add( new AccesoConHuella("Huella Nicolas", 4, 3, false) );
    	activadores.add( new Bombillo("Bombillo Nicolas", 1, 3, true) );
    	activadores.add( new EquipoDeSonido("Sonido Nicolas", 1, 5, true) );
    	activadores.add( new Lampara("Lampara Nathalia", 3, 5, true) );
    	activadores.add( new Televisor("TV Nicolas", 4, false) );
    	activadores.add( new Ventana("Ventana baño Nathalia", 2, false, false) );
    	activadores.add( new Ventilador("Ventilador Nicolas", 4, 3, true) );
    	
    	// Crear el objeto casa
    	Casa casa = new Casa("123", pisos);
    	casa.setSensores(sensores);
    	casa.setActivadores(activadores);
    	
    	// Convertir a JSON
    	Gson gson = new Gson();
    	return Response.ok(gson.toJson(casa)).header("Access-Control-Allow-Origin", "*").build();
    }
 
}