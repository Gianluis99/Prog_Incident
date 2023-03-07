package com.plugin.gestioneIncident.demo.model;

import java.util.Objects;

public class Piattafoma {

	private String nomePiattaforma;
	private int numeroToken;
	private int tokenConsumati;

	public Piattafoma(String nomePiattaforma, int numeroToken, int tokenConsumati) {
		super();
		this.nomePiattaforma = nomePiattaforma;
		this.numeroToken = numeroToken;
		this.tokenConsumati = tokenConsumati;
	}

	public String getNomePiattaforma() {
		return nomePiattaforma;
	}

	public void setNomePiattaforma(String nomePiattaforma) {
		this.nomePiattaforma = nomePiattaforma;
	}

	public int getNumeroToken() {
		return numeroToken;
	}

	public void setNumeroToken(int numeroToken) {
		this.numeroToken = numeroToken;
	}

	public int getTokenConsumati() {
		return tokenConsumati;
	}

	public void setTokenConsumati(int tokenConsumati) {
		this.tokenConsumati = tokenConsumati;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomePiattaforma, numeroToken, tokenConsumati);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piattafoma other = (Piattafoma) obj;
		return Objects.equals(nomePiattaforma, other.nomePiattaforma) && numeroToken == other.numeroToken
				&& tokenConsumati == other.tokenConsumati;
	}

	@Override
	public String toString() {
		return "Piattafoma [nomePiattaforma=" + nomePiattaforma + ", numeroToken=" + numeroToken + ", tokenConsumati="
				+ tokenConsumati + "]";
	}

}
