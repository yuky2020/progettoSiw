package it.silph.pg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.silph.Album;
import it.silph.Fotografo;

public class Dialoguer {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("silph-unit");
	private static EntityManager em = emf.createEntityManager();
	
	public static void carica(Object o) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(o);
		tx.commit();
	}
	
	public static List<String> getUsernameInUso(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<String> inUso = (List<String>) em.createNamedQuery("findAllNames",String.class).getResultList();
		tx.commit();
		return inUso;
	}
	
	public static List<Fotografo> getFotografi(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Fotografo> fotografi = (List<Fotografo>) em.createNamedQuery("findAllFotografi", Fotografo.class).getResultList();
		tx.commit();
		return fotografi;
	}
	
	public static Fotografo getFotografo(String username) {
		return null;		
	}
	
	public static List<Album> retrieveAlbumByNomeAutore(String username) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/", "postgres", "benni");
		/* TODO */
		return null;
	}
}
