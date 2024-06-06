package oo2.practico5.ejercicio1;

import oo2.practico5.ejercicio1.modelo.Motor;
import oo2.practico5.ejercicio1.modelo.motores.AdaptadorElectrico;
import oo2.practico5.ejercicio1.modelo.motores.Comun;
import oo2.practico5.ejercicio1.modelo.motores.Economico;
import oo2.practico5.ejercicio1.modelo.motores.Electrico;

public class Main {
	public static void main(String[] args) {
		probarMotor(new Comun());
		probarMotor(new Economico());
		probarMotor(new AdaptadorElectrico(new Electrico()));
	}

	private static void probarMotor(Motor motor) {
		System.out.println("Probando motor " + motor.getClass().getName());
		motor.arrancar();
		motor.acelerar();
		motor.apagar();
	}
}
