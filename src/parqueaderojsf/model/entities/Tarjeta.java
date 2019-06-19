package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tarjeta database table.
 * 
 */
@Entity
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t")
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String rfid;

	private int estado;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	private Date fechainicio;

	//bi-directional many-to-one association to Ingresotarjeta
	@OneToMany(mappedBy="tarjetaBean")
	private List<Ingresotarjeta> ingresotarjetas;

	//bi-directional many-to-one association to Pagomensual
	@OneToMany(mappedBy="tarjetaBean")
	private List<Pagomensual> pagomensuals;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente clienteBean;

	//bi-directional many-to-one association to Tipovehiculo
	@ManyToOne
	@JoinColumn(name="tipovehiculo")
	private Tipovehiculo tipovehiculoBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuarioactivo")
	private Usuario usuario;

	public Tarjeta() {
	}

	public String getRfid() {
		return this.rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
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

	public List<Ingresotarjeta> getIngresotarjetas() {
		return this.ingresotarjetas;
	}

	public void setIngresotarjetas(List<Ingresotarjeta> ingresotarjetas) {
		this.ingresotarjetas = ingresotarjetas;
	}

	public Ingresotarjeta addIngresotarjeta(Ingresotarjeta ingresotarjeta) {
		getIngresotarjetas().add(ingresotarjeta);
		ingresotarjeta.setTarjetaBean(this);

		return ingresotarjeta;
	}

	public Ingresotarjeta removeIngresotarjeta(Ingresotarjeta ingresotarjeta) {
		getIngresotarjetas().remove(ingresotarjeta);
		ingresotarjeta.setTarjetaBean(null);

		return ingresotarjeta;
	}

	public List<Pagomensual> getPagomensuals() {
		return this.pagomensuals;
	}

	public void setPagomensuals(List<Pagomensual> pagomensuals) {
		this.pagomensuals = pagomensuals;
	}

	public Pagomensual addPagomensual(Pagomensual pagomensual) {
		getPagomensuals().add(pagomensual);
		pagomensual.setTarjetaBean(this);

		return pagomensual;
	}

	public Pagomensual removePagomensual(Pagomensual pagomensual) {
		getPagomensuals().remove(pagomensual);
		pagomensual.setTarjetaBean(null);

		return pagomensual;
	}

	public Cliente getClienteBean() {
		return this.clienteBean;
	}

	public void setClienteBean(Cliente clienteBean) {
		this.clienteBean = clienteBean;
	}

	public Tipovehiculo getTipovehiculoBean() {
		return this.tipovehiculoBean;
	}

	public void setTipovehiculoBean(Tipovehiculo tipovehiculoBean) {
		this.tipovehiculoBean = tipovehiculoBean;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}