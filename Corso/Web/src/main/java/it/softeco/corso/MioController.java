package it.softeco.corso;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class MioController {

	FactoryEnum x = FactoryEnum.b;

	public MioController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Inject
	@Any
	Instance<Libreria> librerie;

	public void postLibro(Libro l) {
		Libreria daUsare = null;
		Instance<Libreria> lib = librerie.select(new QualFQualifier(x));
		if (!lib.isUnsatisfied() && !lib.isAmbiguous()) {
			daUsare = lib.get();
		}
		if (daUsare != null)
			daUsare.aggiungiLibroSeNonEsiste(l);
	}
}
