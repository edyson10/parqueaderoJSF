package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the pagomensual database table.
 * 
 */
@Entity
@NamedQuery(name="Pagomensual.findAll", query="SELECT p FROM Pagomensual p")
public class Pagomensual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistro;

	private BigDecimal valor;

	//bi-directional one-to-one association to Pago
	@OneToOne
	@JoinColumn(name="id")
	private Pago pago;

	//bi-directional many-to-one association to Tarjeta
	@ManyToOne
	@JoinColumn(name="tarjeta")
	private Tarjeta tarjetaBean;

	public Pagomensual() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pago getPago() {
		return this.pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Tarjeta getTarjetaBean() {
		return this.tarjetaBean;
	}

	public void setTarjetaBean(Tarjeta tarjetaBean) {
		this.tarjetaBean = tarjetaBean;
	}

}