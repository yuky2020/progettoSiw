package it.silph;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "findAllAlbum", query = "Select a FROM Album a")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String nome;
	private LocalDateTime creazione;
	@ManyToOne
	private Fotografo fotografo;
	@OneToMany(mappedBy = "album")
	private List<Foto> caricamenti;
	@OneToOne
	private Foto copertina;
	
	public Album(String nome) {
		this.nome = nome;
		this.creazione = LocalDateTime.now();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getCreazione() {
		return creazione;
	}

	public void setCreazione(LocalDateTime creazione) {
		this.creazione = creazione;
	}

	public Fotografo getFotogrado() {
		return fotografo;
	}

	public void setAutore(Fotografo creator) {
		this.fotografo = creator;
	}

	public List<Foto> getCaricamenti() {
		return caricamenti;
	}

	public void setCaricamenti(List<Foto> caricamenti) {
		this.caricamenti = caricamenti;
	}

	public Foto getCopertina() {
		return copertina;
	}

	public void setCopertina(Foto copertina) {
		this.copertina = copertina;
	}
}
