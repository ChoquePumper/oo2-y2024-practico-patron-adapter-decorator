package oo2.practico5.ejercicio3.modelo;

import java.io.File;

public abstract class DecoradorReporte implements ComponenteReporte {
	private final ComponenteReporte componenteReporte;

	protected DecoradorReporte(ComponenteReporte componenteReporte) {
		this.componenteReporte = componenteReporte;
	}

	@Override
	public void export(File file) {
		componenteReporte.export(file);
	}
}
