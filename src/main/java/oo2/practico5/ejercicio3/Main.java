package oo2.practico5.ejercicio3;

import oo2.practico5.ejercicio3.modelo.Report;
import oo2.practico5.ejercicio3.modelo.VerificarArchivoExistente;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		new VerificarArchivoExistente(new Report(armarReporte())).export(new File("ejercicio3.txt"));
	}

	private static String armarReporte() {
		return "Ejecutando main " + LocalDateTime.now() + ": \n"
				+ String.join("\n", Arrays.stream(Thread.currentThread().getStackTrace()).map(StackTraceElement::toString).toList());
	}
}
