package oo2.practico5.ejercicio3.modelo;

import java.io.File;

public class VerificarArchivoExistente extends DecoradorReporte {
	public VerificarArchivoExistente(ComponenteReporte componenteReporte) {
		super(componenteReporte);
	}

	@Override
	public void export(File file) {
		validarNoNulo(file);
		noProcederSiExiste(file);
		// Continuar si no hubo error.
		super.export(file);
	}

	private static void validarNoNulo(File file) {
		if (file == null) {
			throw new IllegalArgumentException(
					"File es NULL; no puedo exportar..."
			);
		}
	}

	private static void noProcederSiExiste(File file) {
		if (file.exists()) {
			throw new IllegalArgumentException(
					"El archivo ya existe..."
			);
		}
	}
}
