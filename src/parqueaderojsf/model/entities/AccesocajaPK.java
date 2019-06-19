package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the accesocaja database table.
 * 
 */
@Embeddable
public class AccesocajaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int caja;

	@Column(insertable=false, updatable=false)
	private int usuario;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fechainicio;

	public AccesocajaPK() {
	}
	public int getCaja() {
		return this.caja;
	}
	public void setCaja(int caja) {
		this.caja = caja;
	}
	public int getUsuario() {
		return this.usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public java.util.Date getFechainicio() {
		return this.fechainicio;
	}
	public void setFechainicio(java.util.Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccesocajaPK)) {
			return false;
		}
		AccesocajaPK castOther = (AccesocajaPK)other;
		return 
			(this.caja == castOther.caja)
			&& (this.usuario == castOther.usuario)
			&& this.fechainicio.equals(castOther.fechainicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.caja;
		hash = hash * prime + this.usuario;
		hash = hash * prime + this.fechainicio.hashCode();
		
		return hash;
	}
}