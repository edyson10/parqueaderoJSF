package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the caja database table.
 * 
 */
@Entity
@NamedQuery(name="Caja.findAll", query="SELECT c FROM Caja c")
public class Caja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Accesocaja
	@OneToMany(mappedBy="cajaBean")
	private List<Accesocaja> accesocajas;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="cajaBean")
	private List<Pago> pagos;

	public Caja() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Accesocaja> getAccesocajas() {
		return this.accesocajas;
	}

	public void setAccesocajas(List<Accesocaja> accesocajas) {
		this.accesocajas = accesocajas;
	}

	public Accesocaja addAccesocaja(Accesocaja accesocaja) {
		getAccesocajas().add(accesocaja);
		accesocaja.setCajaBean(this);

		return accesocaja;
	}

	public Accesocaja removeAccesocaja(Accesocaja accesocaja) {
		getAccesocajas().remove(accesocaja);
		accesocaja.setCajaBean(null);

		return accesocaja;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setCajaBean(this);

		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setCajaBean(null);

		return pago;
	}

}