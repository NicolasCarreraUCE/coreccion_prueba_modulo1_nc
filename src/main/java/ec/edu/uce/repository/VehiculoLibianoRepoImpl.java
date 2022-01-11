package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AVehiculo;
import ec.edu.uce.modelo.VehiculoLibiano;

@Repository
@Qualifier("libiano")
public class VehiculoLibianoRepoImpl implements IVehiculoRepo {

	private VehiculoLibiano vehiculoLibiano;
	
	@Override
	public void crearVehiculo(AVehiculo vehiculo, String argumento) {
		// TODO Auto-generated method stub
		this.vehiculoLibiano = (VehiculoLibiano) vehiculo;
		this.vehiculoLibiano.setClindrajeTurbo(argumento);
	}

	// SET-GET
	public VehiculoLibiano getVehiculoLibiano() {
		return vehiculoLibiano;
	}

	public void setVehiculoLibiano(VehiculoLibiano vehiculoLibiano) {
		this.vehiculoLibiano = vehiculoLibiano;
	}

	
	
}
