package com.plugin.gestioneIncident.demo.model;

import java.util.Objects;

public class Assegnatario {
	//prova
	private int idCodiceAssegnatario;
	private String nomeAssegnatario;
	private String cognomeAssegnatario;
	private String usernameAssegnatario;
	private String passwordAssegnatario;

	public Assegnatario(int idCodiceAssegnatario, String nomeAssegnatario, String cognomeAssegnatario,
			String usernameAssegnatario, String passwordAssegnatario) {
		super();
		this.idCodiceAssegnatario = idCodiceAssegnatario;
		this.nomeAssegnatario = nomeAssegnatario;
		this.cognomeAssegnatario = cognomeAssegnatario;
		this.usernameAssegnatario = usernameAssegnatario;
		this.passwordAssegnatario = passwordAssegnatario;
	}

	public int getIdCodiceAssegnatario() {
		return idCodiceAssegnatario;
	}

	public void setIdCodiceAssegnatario(int idCodiceAssegnatario) {
		this.idCodiceAssegnatario = idCodiceAssegnatario;
	}

	public String getNomeAssegnatario() {
		return nomeAssegnatario;
	}

	public void setNomeAssegnatario(String nomeAssegnatario) {
		this.nomeAssegnatario = nomeAssegnatario;
	}

	public String getCognomeAssegnatario() {
		return cognomeAssegnatario;
	}

	public void setCognomeAssegnatario(String cognomeAssegnatario) {
		this.cognomeAssegnatario = cognomeAssegnatario;
	}

	public String getUsernameAssegnatario() {
		return usernameAssegnatario;
	}

	public void setUsernameAssegnatario(String usernameAssegnatario) {
		this.usernameAssegnatario = usernameAssegnatario;
	}

	public String getPasswordAssegnatario() {
		return passwordAssegnatario;
	}

	public void setPasswordAssegnatario(String passwordAssegnatario) {
		this.passwordAssegnatario = passwordAssegnatario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognomeAssegnatario, idCodiceAssegnatario, nomeAssegnatario, passwordAssegnatario,
				usernameAssegnatario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assegnatario other = (Assegnatario) obj;
		return Objects.equals(cognomeAssegnatario, other.cognomeAssegnatario)
				&& idCodiceAssegnatario == other.idCodiceAssegnatario
				&& Objects.equals(nomeAssegnatario, other.nomeAssegnatario)
				&& Objects.equals(passwordAssegnatario, other.passwordAssegnatario)
				&& Objects.equals(usernameAssegnatario, other.usernameAssegnatario);
	}

	@Override
	public String toString() {
		return "Assegnatario [idCodiceAssegnatario=" + idCodiceAssegnatario + ", nomeAssegnatario=" + nomeAssegnatario
				+ ", cognomeAssegnatario=" + cognomeAssegnatario + ", usernameAssegnatario=" + usernameAssegnatario
				+ ", passwordAssegnatario=" + passwordAssegnatario + "]";
	}

}
