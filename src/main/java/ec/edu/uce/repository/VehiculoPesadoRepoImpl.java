package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.AVehiculo;
import ec.edu.uce.modelo.VehiculoPesado;

@Repository
@Qualifier("pesado")
public class VehiculoPesadoRepoImpl implements IVehiculoRepo {

	private VehiculoPesado vehiculoPesado;
	
	@Override
	public void crearVehiculo(AVehiculo vehiculo, String argumento) {
		// TODO Auto-generated method stub
		this.vehiculoPesado = (VehiculoPesado) vehiculoPesado;
		this.vehiculoPesado.setPesoToneladas(argumento);
	}

	// SET-GET
	public VehiculoPesado getVehiculoPesado() {
		return vehiculoPesado;
	}

	public void setVehiculoPesado(VehiculoPesado vehiculoPesado) {
		this.vehiculoPesado = vehiculoPesado;
	}
	

}
