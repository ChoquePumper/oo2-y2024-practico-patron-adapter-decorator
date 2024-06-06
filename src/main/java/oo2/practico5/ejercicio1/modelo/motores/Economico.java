package oo2.practico5.ejercicio1.modelo.motores;

import oo2.practico5.ejercicio1.modelo.Motor;

public class Economico implements Motor {
	@Override
	public void arrancar() {
		System.out.println("Economico.arrancar");
	}

	@Override
	public void acelerar() {
		System.out.println("Economico.acelerar");
	}

	@Override
	public void apagar() {
		System.out.println("Economico.apagar");
	}
}
