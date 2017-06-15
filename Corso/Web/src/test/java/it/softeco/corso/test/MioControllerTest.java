package it.softeco.corso.test;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.commonjava.indy.test.utils.WeldJUnit4Runner;
import org.junit.Test;
import org.junit.runner.RunWith;

import it.softeco.corso.MioController;

@RunWith(WeldJUnit4Runner.class)
public class MioControllerTest {
	
	@Inject
	MioController c;

	@Test
	public void testPostLibro() {
		c.postLibro(null);
	}
}
