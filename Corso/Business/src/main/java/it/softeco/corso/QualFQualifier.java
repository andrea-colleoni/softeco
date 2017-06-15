package it.softeco.corso;

import javax.enterprise.util.AnnotationLiteral;

public class QualFQualifier extends AnnotationLiteral<QualF>
implements QualF {
	
	private FactoryEnum value;
	

	public QualFQualifier(FactoryEnum value) {
		this.value = value;
	}


	public FactoryEnum value() {
		return value;
	}

}
