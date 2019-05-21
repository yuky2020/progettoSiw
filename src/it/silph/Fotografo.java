package it.silph;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "findAllFotografi", query = "Select f from Fotografo f")
@NamedQuery(name = "findAllNames", query = "Select f.username From Fotografo f")
public class Fotografo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false, unique = true)
	private String username;
	@OneToMany(mappedBy = "fotografo")
	private List<Album> album;
	@OneToMany(mappedBy = "fotografo")
	private List<Foto> foto;
	
	public Fotografo(String username) {
		this.username = username;
		this.album = new ArrayList<Album>();
		this.foto = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}

	public List<Foto> getFoto() {
		return foto;
	}

	public void setFoto(List<Foto> foto) {
		this.foto = foto;
	}
}
