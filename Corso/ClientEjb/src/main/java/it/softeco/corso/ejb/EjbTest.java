package it.softeco.corso.ejb;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EjbTest {

	public static void main(String[] args) throws NamingException {
		Hashtable<String, Object> props = new Hashtable<>();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		//props.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		props.put(Context.PROVIDER_URL, "remote://localhost:4447");
		InitialContext ctx = new InitialContext(props);
		
		EsempioEjb obj = (EsempioEjb)ctx.lookup("java:global/Web-0.0.1-SNAPSHOT/EsempioEjb");
		System.out.println(obj.doSomething());
	}

}
