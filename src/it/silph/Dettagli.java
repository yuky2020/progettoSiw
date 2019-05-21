package it.silph;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "findAllDettagli", query = "SELECT d FROM Dettagli d")
public class Dettagli {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String indirizzo;
	
	public Dettagli(String nome, String cognome, String indirizzo) {
		this.indirizzo = indirizzo;
		this.nome = nome;
		this.cognome = cognome;
	}
}
