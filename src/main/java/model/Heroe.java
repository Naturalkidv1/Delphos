package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the heroes database table.
 * 
 */
@Entity
@Table(name="heroes")
@NamedQuery(name="Heroe.findAll", query="SELECT h FROM Heroe h")
public class Heroe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codHeroe;

	private String aliasHeroe;

	private String apellHeroe;

	private boolean estado;

	private String lugarNacHeroe;

	private String nomHeroe;

	private String organizacion;

	//bi-directional one-to-one association to Contratoheroe
	@OneToOne(mappedBy="heroe")
	private Contratoheroe contratoheroe;

	//bi-directional many-to-one association to Podere
	@ManyToOne
	@JoinColumn(name="codPoder")
	private Poder poder;

	public Heroe() {
	}

	public int getCodHeroe() {
		return this.codHeroe;
	}

	public void setCodHeroe(int codHeroe) {
		this.codHeroe = codHeroe;
	}

	public String getAliasHeroe() {
		return this.aliasHeroe;
	}

	public void setAliasHeroe(String aliasHeroe) {
		this.aliasHeroe = aliasHeroe;
	}

	public String getApellHeroe() {
		return this.apellHeroe;
	}

	public void setApellHeroe(String apellHeroe) {
		this.apellHeroe = apellHeroe;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getLugarNacHeroe() {
		return this.lugarNacHeroe;
	}

	public void setLugarNacHeroe(String lugarNacHeroe) {
		this.lugarNacHeroe = lugarNacHeroe;
	}

	public String getNomHeroe() {
		return this.nomHeroe;
	}

	public void setNomHeroe(String nomHeroe) {
		this.nomHeroe = nomHeroe;
	}

	public String getOrganizacion() {
		return this.organizacion;
	}

	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}

	public Contratoheroe getContratoheroe() {
		return this.contratoheroe;
	}

	public void setContratoheroe(Contratoheroe contratoheroe) {
		this.contratoheroe = contratoheroe;
	}

	public Poder getPoderes() {
		return this.poder;
	}

	public void setPoderes(Poder poder) {
		this.poder = poder;
	}
	
	@Override
    public String toString() {
        return nomHeroe + " " + apellHeroe + " - " + aliasHeroe;
    }

}