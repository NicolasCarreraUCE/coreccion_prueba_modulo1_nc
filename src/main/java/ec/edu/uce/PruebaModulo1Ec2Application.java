package ec.edu.uce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.AVehiculo;
import ec.edu.uce.modelo.GestionMatricula;
import ec.edu.uce.modelo.Propietario;

@SpringBootApplication
public class PruebaModulo1Ec2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo1Ec2Application.class, args);
	}

	private AVehiculo vehiculo;
	
	private GestionMatricula gm;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario prop = new Propietario();
		prop.setNombre("Nicolas");
		prop.setApellido("Carrera");
		prop.setCedula("1727450684");
	}

}
