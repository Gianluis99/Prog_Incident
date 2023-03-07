package com.plugin.gestioneIncident.demo.model;

import java.io.File;

public class Allegato {

	private String idCodice;
	private String nomeAllegato;
	private File file;

	public Allegato(String idCodice, String nomeAllegato, File file) {
		super();
		this.idCodice = idCodice;
		this.nomeAllegato = nomeAllegato;
		this.setFile(file);
	}

	public String getIdCodice() {
		return idCodice;
	}

	public void setIdCodice(String idCodice) {
		this.idCodice = idCodice;
	}

	public String getNomeAllegato() {
		return nomeAllegato;
	}

	public void setNomeAllegato(String nomeAllegato) {
		this.nomeAllegato = nomeAllegato;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	

}
