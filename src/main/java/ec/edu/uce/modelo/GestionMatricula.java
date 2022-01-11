package ec.edu.uce.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

public class GestionMatricula {
	
	private static final Logger LOG = LoggerFactory.getLogger(GestionMatricula.class);
	
	
	public void matricualrVehiculo(AVehiculo vehiculo, Propietario propietario) {
		this.LOG.info("El vehiculo " + vehiculo.toString() + " se ha matriculado con exito");
		this.LOG.info("con el propietario " + propietario.toString());
		this.LOG.info("Se ha guardado correctamente a la base de datos");
	}
	
	public void imprimirVehiculo(AVehiculo vehiculo) {
		this.LOG.info(vehiculo.toString());
	}

}
