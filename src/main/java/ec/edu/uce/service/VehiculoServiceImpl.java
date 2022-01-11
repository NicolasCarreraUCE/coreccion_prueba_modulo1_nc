package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ec.edu.uce.modelo.AVehiculo;
import ec.edu.uce.repository.IVehiculoRepo;

public class VehiculoServiceImpl implements IVehiculoService {

	private static final Logger LOG = LoggerFactory.getLogger(VehiculoServiceImpl.class);
	
	@Autowired
	@Qualifier("libiano")
	private IVehiculoRepo vehiculoLibiano;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoRepo vehiculoPesado;
	
	@Override
	public void generarVehiculo(AVehiculo vehiculo, String argumento) {
		// TODO Auto-generated method stub
		switch (vehiculo.getTipo()) {
		case "LIBIANO":
			vehiculo.calcualrValorMatricula();
			this.vehiculoLibiano.crearVehiculo(vehiculo, argumento);
			LOG.info("Se ha generado un nuevo vehiculo libiano");
			break;
		case "PESADO":
			vehiculo.calcualrValorMatricula();
			this.vehiculoPesado.crearVehiculo(vehiculo, argumento);
			LOG.info("Se ha generado un nuevo vehiculo pesado");
			break;
		default:
			LOG.error("ERROR: Vheiculo no registrado");
		}
	}

}
