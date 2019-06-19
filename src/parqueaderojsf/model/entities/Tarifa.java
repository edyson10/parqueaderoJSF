package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tarifa database table.
 * 
 */
@Entity
@NamedQuery(name="Tarifa.findAll", query="SELECT t FROM Tarifa t")
public class Tarifa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	private BigDecimal valor;

	//bi-directional many-to-one association to Tipotarifa
	@ManyToOne
	@JoinColumn(name="tipotarifa")
	private Tipotarifa tipotarifaBean;

	//bi-directional many-to-one association to Tipovehiculo
	@ManyToOne
	@JoinColumn(name="tipovehiculo")
	private Tipovehiculo tipovehiculoBean;

	public Tarifa() {
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

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Tipotarifa getTipotarifaBean() {
		return this.tipotarifaBean;
	}

	public void setTipotarifaBean(Tipotarifa tipotarifaBean) {
		this.tipotarifaBean = tipotarifaBean;
	}

	public Tipovehiculo getTipovehiculoBean() {
		return this.tipovehiculoBean;
	}

	public void setTipovehiculoBean(Tipovehiculo tipovehiculoBean) {
		this.tipovehiculoBean = tipovehiculoBean;
	}

}