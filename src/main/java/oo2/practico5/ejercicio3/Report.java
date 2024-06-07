package oo2.practico5.ejercicio3;

import java.io.*;

public class Report {
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	void export(File file) throws IOException {
		if (file == null) {
			throw new IllegalArgumentException(
					"File es NULL; no puedo exportar..."
			);
		}

		if (file.exists()) {
			throw new IllegalArgumentException(
					"El archivo ya existe..."
			);
		}

		// Exportar el reporte a un archivo.
		try (Writer writer = new FileWriter(file)) {
			writer.write(this.reporte);
		}
	}
}
