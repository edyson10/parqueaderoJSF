package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ingresonormal database table.
 * 
 */
@Entity
@NamedQuery(name="Ingresonormal.findAll", query="SELECT i FROM Ingresonormal i")
public class Ingresonormal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional one-to-one association to Ingreso
	@OneToOne
	@JoinColumn(name="id")
	private Ingreso ingreso;

	//bi-directional one-to-one association to Pagoservicio
	@OneToOne(mappedBy="ingresonormal")
	private Pagoservicio pagoservicio;

	public Ingresonormal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ingreso getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}

	public Pagoservicio getPagoservicio() {
		return this.pagoservicio;
	}

	public void setPagoservicio(Pagoservicio pagoservicio) {
		this.pagoservicio = pagoservicio;
	}

}