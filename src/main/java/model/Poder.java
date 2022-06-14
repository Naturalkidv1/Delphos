package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the poderes database table.
 * 
 */
@Entity
@Table(name="poderes")
@NamedQuery(name="Poder.findAll", query="SELECT p FROM Poder p")
public class Poder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codPoder;

	private String detallesPoder;

	private String nombrePoder;

	private char rangoPoder;

	//bi-directional many-to-one association to Heroe
	@OneToMany(mappedBy="poder")
	private List<Heroe> heroes;

	public Poder() {
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

	public List<Heroe> getHeroes() {
		return this.heroes;
	}

	public void setHeroes(List<Heroe> heroes) {
		this.heroes = heroes;
	}

	public Heroe addHeroe(Heroe heroe) {
		getHeroes().add(heroe);
		heroe.setPoderes(this);

		return heroe;
	}

	public Heroe removeHeroe(Heroe heroe) {
		getHeroes().remove(heroe);
		heroe.setPoderes(null);

		return heroe;
	}

}