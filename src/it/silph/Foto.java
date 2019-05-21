package it.silph;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "findAllFoto", query = "SELECT f FROM Foto f")
public class Foto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titolo;
	private LocalDateTime creazione;
	@Column(nullable = false)
	private String path;
	@ManyToOne
	private Fotografo fotografo;
	@ManyToOne
	private Album album;
	
	public Foto(Fotografo autore, String titolo, String path) {
		this.fotografo = autore;
		this.titolo = titolo;
		this.path = path;
		this.creazione = LocalDateTime.now();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Fotografo getFotografo() {
		return fotografo;
	}

	public void setFotografo(Fotografo autore) {
		this.fotografo = autore;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public LocalDateTime getCreazione() {
		return creazione;
	}

	public void setCreazione(LocalDateTime creazione) {
		this.creazione = creazione;
	}
	
	
	
	
	
	

}
