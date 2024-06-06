package oo2.practico5.ejercicio1.modelo.motores;

import oo2.practico5.ejercicio1.modelo.Motor;

public class Comun implements Motor {
	@Override
	public void arrancar() {
		System.out.println("Comun.arrancar");
	}

	@Override
	public void acelerar() {
		System.out.println("Comun.acelerar");
	}

	@Override
	public void apagar() {
		System.out.println("Comun.apagar");
	}
}
