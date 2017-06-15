package it.softeco.corso.ejb;

import javax.ejb.Remote;

@Remote
public interface InterfacciaEjb {

	String doSomething();
}
