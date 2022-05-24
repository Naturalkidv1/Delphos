package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contratoheroe database table.
 * 
 */
@Entity
@NamedQuery(name="Contratoheroe.findAll", query="SELECT c FROM Contratoheroe c")
public class Contratoheroe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContratoheroePK id;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="codEmpresa")
	private Empresa empresa;

	//bi-directional one-to-one association to Heroe
	@OneToOne(mappedBy="contratoheroe")
	private Heroe heroe;

	public Contratoheroe() {
	}

	public ContratoheroePK getId() {
		return this.id;
	}

	public void setId(ContratoheroePK id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Heroe getHeroe() {
		return this.heroe;
	}

	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}

}