package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ingreso database table.
 * 
 */
@Entity
@NamedQuery(name="Ingreso.findAll", query="SELECT i FROM Ingreso i")
public class Ingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaingreso;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechasalida;

	private String numero;

	//bi-directional many-to-one association to Tipovehiculo
	@ManyToOne
	@JoinColumn(name="tipo")
	private Tipovehiculo tipovehiculo;

	//bi-directional one-to-one association to Ingresonormal
	@OneToOne(mappedBy="ingreso")
	private Ingresonormal ingresonormal;

	//bi-directional one-to-one association to Ingresotarjeta
	@OneToOne(mappedBy="ingreso")
	private Ingresotarjeta ingresotarjeta;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="ingresoBean")
	private List<Pago> pagos;

	public Ingreso() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechasalida() {
		return this.fechasalida;
	}

	public void setFechasalida(Date fechasalida) {
		this.fechasalida = fechasalida;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Tipovehiculo getTipovehiculo() {
		return this.tipovehiculo;
	}

	public void setTipovehiculo(Tipovehiculo tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public Ingresonormal getIngresonormal() {
		return this.ingresonormal;
	}

	public void setIngresonormal(Ingresonormal ingresonormal) {
		this.ingresonormal = ingresonormal;
	}

	public Ingresotarjeta getIngresotarjeta() {
		return this.ingresotarjeta;
	}

	public void setIngresotarjeta(Ingresotarjeta ingresotarjeta) {
		this.ingresotarjeta = ingresotarjeta;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setIngresoBean(this);
		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setIngresoBean(null);
		return pago;
	}
}