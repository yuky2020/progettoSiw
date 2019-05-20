package it.silph;

public class Portale {
	private Silph azienda;
	private Richiesta richiestaCorrente;
	private Admin adminCorrente;
	private Fotografo fotografoCorrente;
	private Album albumCorrente;
	
	public Portale() {
		this.azienda = new Silph();
	}
	public Fotografo getFotografoCorrente() {
		return fotografoCorrente;
	}
	public void setFotografoCorrente(Fotografo fotografoCorrente) {
		this.fotografoCorrente = fotografoCorrente;
	}
	public Silph getAzienda() {
		return azienda;
	}
	public void setAzienda(Silph azienda) {
		this.azienda = azienda;
	}
	public Richiesta getRichiestaCorrente() {
		return richiestaCorrente;
	}
	public void setRichiestaCorrente(Richiesta richiestaCorrente) {
		this.richiestaCorrente = richiestaCorrente;
	}
	public Admin getAdminCorrente() {
		return adminCorrente;
	}
	public void setAdminCorrente(Admin adminCorrente) {
		this.adminCorrente = adminCorrente;
	}
	public Album getAlbumCorrente() {
		return albumCorrente;
	}
	public void setAlbumCorrente(Album albumCorrente) {
		this.albumCorrente = albumCorrente;
	}
	
	
} 
