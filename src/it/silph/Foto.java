package it.silph;

import java.time.LocalDateTime;

public class Foto {
	Fotografo autore;
	String titolo;
	String path;
	LocalDateTime creazione;
	
	public Foto(Fotografo autore, String titolo, String path, LocalDateTime creazione) {
		super();
		this.autore = autore;
		this.titolo = titolo;
		this.path = path;
		this.creazione = creazione;
	}
	
	
	
	

}
