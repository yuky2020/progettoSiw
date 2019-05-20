package it.silph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Silph {
	private HashMap<String,Admin> admin;
	private HashMap<String,Fotografo> fotografi;
	private List<Foto> fotos;
	private List<Album> albums;
	
	public Silph() {
		this.admin = new HashMap<String, Admin>();
		this.fotografi = new HashMap<String, Fotografo>();
		this.fotos = new ArrayList<Foto>();
		this.albums = new ArrayList<Album>();
	}
	
	public HashMap<String, Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(HashMap<String, Admin> admin) {
		this.admin = admin;
	}
	public HashMap<String, Fotografo> getFotografi() {
		return fotografi;
	}
	public void setFotografi(HashMap<String, Fotografo> fotografi) {
		this.fotografi = fotografi;
	}
	public List<Foto> getFotos() {
		return fotos;
	}
	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	public List<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
}
