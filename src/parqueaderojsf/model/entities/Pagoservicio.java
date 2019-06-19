package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pagoservicio database table.
 * 
 */
@Entity
@NamedQuery(name="Pagoservicio.findAll", query="SELECT p FROM Pagoservicio p")
public class Pagoservicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int ingreso;

	//bi-directional one-to-one association to Ingresonormal
	@OneToOne
	@JoinColumn(name="id")
	private Ingresonormal ingresonormal;

	//bi-directional one-to-one association to Pago
	@OneToOne
	@JoinColumn(name="id")
	private Pago pago;

	public Pagoservicio() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public Ingresonormal getIngresonormal() {
		return this.ingresonormal;
	}

	public void setIngresonormal(Ingresonormal ingresonormal) {
		this.ingresonormal = ingresonormal;
	}

	public Pago getPago() {
		return this.pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

}