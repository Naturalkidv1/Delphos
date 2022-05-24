package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the empresas database table.
 * 
 */
@Entity
@Table(name="empresas")
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codEmpresa;

	private String detallesEmpresa;

	private String nombreEmpresa;

	//bi-directional many-to-one association to Contratoheroe
	@OneToMany(mappedBy="empresa")
	private List<Contratoheroe> contratoheroes;

	public Empresa() {
	}

	public int getCodEmpresa() {
		return this.codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getDetallesEmpresa() {
		return this.detallesEmpresa;
	}

	public void setDetallesEmpresa(String detallesEmpresa) {
		this.detallesEmpresa = detallesEmpresa;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public List<Contratoheroe> getContratoheroes() {
		return this.contratoheroes;
	}

	public void setContratoheroes(List<Contratoheroe> contratoheroes) {
		this.contratoheroes = contratoheroes;
	}

	public Contratoheroe addContratoheroe(Contratoheroe contratoheroe) {
		getContratoheroes().add(contratoheroe);
		contratoheroe.setEmpresa(this);

		return contratoheroe;
	}

	public Contratoheroe removeContratoheroe(Contratoheroe contratoheroe) {
		getContratoheroes().remove(contratoheroe);
		contratoheroe.setEmpresa(null);

		return contratoheroe;
	}

}