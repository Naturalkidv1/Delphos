package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the poderes database table.
 * 
 */
@Entity
@Table(name="poderes")
@NamedQuery(name="Podere.findAll", query="SELECT p FROM Podere p")
public class Podere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codPoder;

	private String detallesPoder;

	private String nombrePoder;

	private char rangoPoder;

	//bi-directional one-to-one association to Heroe
	@OneToOne(mappedBy="podere")
	private Heroe heroe;

	public Podere() {
	}

	public int getCodPoder() {
		return this.codPoder;
	}

	public void setCodPoder(int codPoder) {
		this.codPoder = codPoder;
	}

	public String getDetallesPoder() {
		return this.detallesPoder;
	}

	public void setDetallesPoder(String detallesPoder) {
		this.detallesPoder = detallesPoder;
	}

	public String getNombrePoder() {
		return this.nombrePoder;
	}

	public void setNombrePoder(String nombrePoder) {
		this.nombrePoder = nombrePoder;
	}

	public char getRangoPoder() {
		return this.rangoPoder;
	}

	public void setRangoPoder(char rangoPoder) {
		this.rangoPoder = rangoPoder;
	}

	public Heroe getHeroe() {
		return this.heroe;
	}

	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}

}