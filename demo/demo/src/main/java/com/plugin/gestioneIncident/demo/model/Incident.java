package com.plugin.gestioneIncident.demo.model;

import java.sql.Date;
import java.util.Objects;

public class Incident {

	private String idCodice;
	private Date dataArrivo;
	private Date dataChiusura;
	private String generatoDa;
	private boolean deleted;
	private String ogetto_Inc;
	private String inc_RiferimentoPerPBI;
	private int tokenPrevisti;
	private int tokenUtilizzati;
	private int numeroGiorni;
	private int numeroPersone;
	private String analisi;
	private String sintesi;
	private String nomePiattaforma;
	private String idPriority;
	private String idImpact;
	private int idCodiceAssistente;
	private String idTipologia;
	private String idStato;
	
	public Incident(String idCodice, Date dataArrivo, Date dataChiusura, String generatoDa, boolean deleted,
			String ogetto_Inc, String inc_RiferimentoPerPBI, int tokenPrevisti, int tokenUtilizzati, int numeroGiorni,
			int numeroPersone, String analisi, String sintesi, String nomePiattaforma, String idPriority,
			String idImpact, int idCodiceAssistente, String idTipologia, String idStato) {
		super();
		this.idCodice = idCodice;
		this.dataArrivo = dataArrivo;
		this.dataChiusura = dataChiusura;
		this.generatoDa = generatoDa;
		this.deleted = deleted;
		this.ogetto_Inc = ogetto_Inc;
		this.inc_RiferimentoPerPBI = inc_RiferimentoPerPBI;
		this.tokenPrevisti = tokenPrevisti;
		this.tokenUtilizzati = tokenUtilizzati;
		this.numeroGiorni = numeroGiorni;
		this.numeroPersone = numeroPersone;
		this.analisi = analisi;
		this.sintesi = sintesi;
		this.nomePiattaforma = nomePiattaforma;
		this.idPriority = idPriority;
		this.idImpact = idImpact;
		this.idCodiceAssistente = idCodiceAssistente;
		this.idTipologia = idTipologia;
		this.idStato = idStato;
	}

	public String getIdCodice() {
		return idCodice;
	}

	public void setIdCodice(String idCodice) {
		this.idCodice = idCodice;
	}

	public Date getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(Date dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public Date getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public String getGeneratoDa() {
		return generatoDa;
	}

	public void setGeneratoDa(String generatoDa) {
		this.generatoDa = generatoDa;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getOgetto_Inc() {
		return ogetto_Inc;
	}

	public void setOgetto_Inc(String ogetto_Inc) {
		this.ogetto_Inc = ogetto_Inc;
	}

	public String getInc_RiferimentoPerPBI() {
		return inc_RiferimentoPerPBI;
	}

	public void setInc_RiferimentoPerPBI(String inc_RiferimentoPerPBI) {
		this.inc_RiferimentoPerPBI = inc_RiferimentoPerPBI;
	}

	public int getTokenPrevisti() {
		return tokenPrevisti;
	}

	public void setTokenPrevisti(int tokenPrevisti) {
		this.tokenPrevisti = tokenPrevisti;
	}

	public int getTokenUtilizzati() {
		return tokenUtilizzati;
	}

	public void setTokenUtilizzati(int tokenUtilizzati) {
		this.tokenUtilizzati = tokenUtilizzati;
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public String getAnalisi() {
		return analisi;
	}

	public void setAnalisi(String analisi) {
		this.analisi = analisi;
	}

	public String getSintesi() {
		return sintesi;
	}

	public void setSintesi(String sintesi) {
		this.sintesi = sintesi;
	}

	public String getNomePiattaforma() {
		return nomePiattaforma;
	}

	public void setNomePiattaforma(String nomePiattaforma) {
		this.nomePiattaforma = nomePiattaforma;
	}

	public String getIdPriority() {
		return idPriority;
	}

	public void setIdPriority(String idPriority) {
		this.idPriority = idPriority;
	}

	public String getIdImpact() {
		return idImpact;
	}

	public void setIdImpact(String idImpact) {
		this.idImpact = idImpact;
	}

	public int getIdCodiceAssistente() {
		return idCodiceAssistente;
	}

	public void setIdCodiceAssistente(int idCodiceAssistente) {
		this.idCodiceAssistente = idCodiceAssistente;
	}

	public String getIdTipologia() {
		return idTipologia;
	}

	public void setIdTipologia(String idTipologia) {
		this.idTipologia = idTipologia;
	}

	public String getIdStato() {
		return idStato;
	}

	public void setIdStato(String idStato) {
		this.idStato = idStato;
	}

	@Override
	public String toString() {
		return "Incident [idCodice=" + idCodice + ", dataArrivo=" + dataArrivo + ", dataChiusura=" + dataChiusura
				+ ", generatoDa=" + generatoDa + ", deleted=" + deleted + ", ogetto_Inc=" + ogetto_Inc
				+ ", inc_RiferimentoPerPBI=" + inc_RiferimentoPerPBI + ", tokenPrevisti=" + tokenPrevisti
				+ ", tokenUtilizzati=" + tokenUtilizzati + ", numeroGiorni=" + numeroGiorni + ", numeroPersone="
				+ numeroPersone + ", analisi=" + analisi + ", sintesi=" + sintesi + ", nomePiattaforma="
				+ nomePiattaforma + ", idPriority=" + idPriority + ", idImpact=" + idImpact + ", idCodiceAssistente="
				+ idCodiceAssistente + ", idTipologia=" + idTipologia + ", idStato=" + idStato + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(analisi, dataArrivo, dataChiusura, deleted, generatoDa, idCodice, idCodiceAssistente,
				idImpact, idPriority, idStato, idTipologia, inc_RiferimentoPerPBI, nomePiattaforma, numeroGiorni,
				numeroPersone, ogetto_Inc, sintesi, tokenPrevisti, tokenUtilizzati);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		return Objects.equals(analisi, other.analisi) && Objects.equals(dataArrivo, other.dataArrivo)
				&& Objects.equals(dataChiusura, other.dataChiusura) && deleted == other.deleted
				&& Objects.equals(generatoDa, other.generatoDa) && Objects.equals(idCodice, other.idCodice)
				&& idCodiceAssistente == other.idCodiceAssistente && Objects.equals(idImpact, other.idImpact)
				&& Objects.equals(idPriority, other.idPriority) && Objects.equals(idStato, other.idStato)
				&& Objects.equals(idTipologia, other.idTipologia)
				&& Objects.equals(inc_RiferimentoPerPBI, other.inc_RiferimentoPerPBI)
				&& Objects.equals(nomePiattaforma, other.nomePiattaforma) && numeroGiorni == other.numeroGiorni
				&& numeroPersone == other.numeroPersone && Objects.equals(ogetto_Inc, other.ogetto_Inc)
				&& Objects.equals(sintesi, other.sintesi) && tokenPrevisti == other.tokenPrevisti
				&& tokenUtilizzati == other.tokenUtilizzati;
	}
	
	
	
}
