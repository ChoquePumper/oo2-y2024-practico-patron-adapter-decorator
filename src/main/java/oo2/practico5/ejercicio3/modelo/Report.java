package oo2.practico5.ejercicio3.modelo;

import java.io.*;

public class Report implements ComponenteReporte {
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		// Exportar el reporte a un archivo.
		try (Writer writer = new FileWriter(file)) {
			writer.write(this.reporte);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
