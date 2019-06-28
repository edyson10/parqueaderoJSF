package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the accesocaja database table.
 * 
 */
@Entity
@NamedQuery(name="Accesocaja.findAll", query="SELECT a FROM Accesocaja a")
public class Accesocaja implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccesocajaPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacierre;

	private BigDecimal totalcierre;

	private BigDecimal totalrecibido;

	//bi-directional many-to-one association to Caja
	@ManyToOne
	@JoinColumn(name="caja", insertable=false, updatable=false)
	private Caja cajaBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario", insertable=false, updatable=false)
	private Usuario usuarioBean;

	public Accesocaja() {
	}

	public AccesocajaPK getId() {
		return this.id;
	}

	public void setId(AccesocajaPK id) {
		this.id = id;
	}

	public Date getFechacierre() {
		return this.fechacierre;
	}

	public void setFechacierre(Date fechacierre) {
		this.fechacierre = fechacierre;
	}

	public BigDecimal getTotalcierre() {
		return this.totalcierre;
	}

	public void setTotalcierre(BigDecimal totalcierre) {
		this.totalcierre = totalcierre;
	}

	public BigDecimal getTotalrecibido() {
		return this.totalrecibido;
	}

	public void setTotalrecibido(BigDecimal totalrecibido) {
		this.totalrecibido = totalrecibido;
	}

	public Caja getCajaBean() {
		return this.cajaBean;
	}

	public void setCajaBean(Caja cajaBean) {
		this.cajaBean = cajaBean;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}