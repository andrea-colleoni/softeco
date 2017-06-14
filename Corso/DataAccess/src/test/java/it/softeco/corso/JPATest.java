package it.softeco.corso;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JPATest {
	
	EntityManager em;
	
	@Before
	public void setUp() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("corso");
		em = emf.createEntityManager();	
	}

	@Test
	public void creazioneLibroTest() {
		Libro l = new Libro();
		l.setTitolo("JPA tutorial");
		
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
	}
	
	@Test
	public void libroPerChiaveTest() {
		Libro l = em.find(Libro.class, 1);
		Assert.assertEquals("JPA tutorial", l.getTitolo());
	}	

	@Test
	public void elencoLibriTest() {
		List<Libro> libri = em.createQuery("select l from Libro l", Libro.class)
				.getResultList();
		Assert.assertEquals(1, libri.size());
	}
	
	@Test
	public void manyToManyTest() {
		Libro l = new Libro();
		Autore a = new Autore();
		
		l.setTitolo("Test xx");
		a.setCognome("Rossi 2");
		
		l.setAutori(new ArrayList<Autore>());
		l.getAutori().add(a);
		a.setLibri(new ArrayList<Libro>());
		a.getLibri().add(l);
		
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
	}
}
