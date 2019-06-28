package com.parqueadero.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuariorol database table.
 * 
 */
@Entity
@NamedQuery(name="Usuariorol.findAll", query="SELECT u FROM Usuariorol u")
public class Usuariorol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idrol;

	private int idusuario;

	public Usuariorol() {
	}

	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

}