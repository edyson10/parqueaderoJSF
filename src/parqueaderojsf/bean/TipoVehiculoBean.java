package com.parqueadero.jsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.parqueadero.jpa.dao.TipovehiculoDAO;
import com.parqueadero.jpa.entity.Tipovehiculo;



@ManagedBean
@SessionScoped
public class TipoVehiculoBean {
	private Tipovehiculo tipovehiculo = new Tipovehiculo();
	
	public Tipovehiculo getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(Tipovehiculo tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public List<Tipovehiculo> listarTipoVehiculo() {		
		TipovehiculoDAO tvDao = new TipovehiculoDAO();
		return tvDao.list();
	}
}