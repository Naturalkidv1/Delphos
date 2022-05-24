package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the contratoheroe database table.
 * 
 */
@Embeddable
public class ContratoheroePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int codEmpresa;

	@Column(insertable=false, updatable=false)
	private int codHeroe;

	private int numContratoHeroe;

	public ContratoheroePK() {
	}
	public int getCodEmpresa() {
		return this.codEmpresa;
	}
	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public int getCodHeroe() {
		return this.codHeroe;
	}
	public void setCodHeroe(int codHeroe) {
		this.codHeroe = codHeroe;
	}
	public int getNumContratoHeroe() {
		return this.numContratoHeroe;
	}
	public void setNumContratoHeroe(int numContratoHeroe) {
		this.numContratoHeroe = numContratoHeroe;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContratoheroePK)) {
			return false;
		}
		ContratoheroePK castOther = (ContratoheroePK)other;
		return 
			(this.codEmpresa == castOther.codEmpresa)
			&& (this.codHeroe == castOther.codHeroe)
			&& (this.numContratoHeroe == castOther.numContratoHeroe);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codEmpresa;
		hash = hash * prime + this.codHeroe;
		hash = hash * prime + this.numContratoHeroe;
		
		return hash;
	}
}