package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ingresotarjeta database table.
 * 
 */
@Entity
@NamedQuery(name="Ingresotarjeta.findAll", query="SELECT i FROM Ingresotarjeta i")
public class Ingresotarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional one-to-one association to Ingreso
	@OneToOne
	@JoinColumn(name="id")
	private Ingreso ingreso;

	//bi-directional many-to-one association to Tarjeta
	@ManyToOne
	@JoinColumn(name="tarjeta")
	private Tarjeta tarjetaBean;

	public Ingresotarjeta() {
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

	public Tarjeta getTarjetaBean() {
		return this.tarjetaBean;
	}

	public void setTarjetaBean(Tarjeta tarjetaBean) {
		this.tarjetaBean = tarjetaBean;
	}

}