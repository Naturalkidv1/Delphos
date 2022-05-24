package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codHeroe;

	private String aliasHeroe;

	private String apellHeroe;

	private int codPoder;

	private boolean estado;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecNacHeroe")
	private Date fecNacHeroe;

	private String lugarNacHeroe;

	private String nomHeroe;

	private String organizacion;

	//bi-directional one-to-one association to Contratoheroe
	@OneToOne
	@JoinColumn(name="codHeroe", referencedColumnName="codHeroe")
	private Contratoheroe contratoheroe;

	//bi-directional one-to-one association to Podere
	@OneToOne
	@JoinColumn(name="codHeroe")
	private Podere podere;

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

	public int getCodPoder() {
		return this.codPoder;
	}

	public void setCodPoder(int codPoder) {
		this.codPoder = codPoder;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFecNacHeroe() {
		return this.fecNacHeroe;
	}

	public void setFecNacHeroe(Date fecNacHeroe) {
		this.fecNacHeroe = fecNacHeroe;
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

	public Podere getPodere() {
		return this.podere;
	}

	public void setPodere(Podere podere) {
		this.podere = podere;
	}

}