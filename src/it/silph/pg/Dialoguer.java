package it.silph.pg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dialoguer {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("silph-unit");
	private static EntityManager em = emf.createEntityManager();
	
	public static void carica(Object o) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(o);
		tx.commit();
	}
	
	
}
