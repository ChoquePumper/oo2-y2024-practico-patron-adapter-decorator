package oo2.practico5.ejercicio1.modelo.motores;

import oo2.practico5.ejercicio1.modelo.Motor;
import oo2.practico5.ejercicio1.modelo.electrico.Electrico;

public class AdaptadorElectrico implements Motor {

	private final Electrico motor;

	public AdaptadorElectrico(Electrico motorAdaptable) {
		this.motor = motorAdaptable;
	}

	@Override
	public void arrancar() {
		System.out.println("AdaptadorElectrico.arrancar");
		motor.conectar();
		motor.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("AdaptadorElectrico.acelerar");
		motor.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("AdaptadorElectrico.apagar");
		motor.detener();
		motor.desconectar();
	}
}
