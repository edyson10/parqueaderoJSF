/*
package com.parqueadero.jsf.bean;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.parqueadero.jpa.dao.IngresoDAO;
import com.parqueadero.jpa.dao.PagoDao;
import com.parqueadero.jpa.dao.TipovehiculoDAO;
import com.parqueadero.jpa.entity.Ingreso;
import com.parqueadero.jpa.entity.Tipovehiculo;

@ManagedBean
@SessionScoped
public class PorteroBean {
	private Ingreso ingreso = new Ingreso();
	private String comboTipoVehiculo;
	private String numero = "";
	
	public Ingreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}
	
	public String getComboTipoVehiculo() {
		return comboTipoVehiculo;
	}

	public void setComboTipoVehiculo(String comboTipoVehiculo) {
		this.comboTipoVehiculo = comboTipoVehiculo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String registrarIngreso() {
		IngresoDAO iDao = new IngresoDAO();
		TipovehiculoDAO tvDao = new TipovehiculoDAO();
		
		Tipovehiculo tv =  tvDao.find(Integer.parseInt(comboTipoVehiculo));
		System.out.println(tv.getDescripcion());
		ingreso.setTipo(tv.getId());
		
		ingreso.setFechaingreso(new Date());
		
		Integer size = iDao.list().size();
		ingreso.setNumero(tv.getDescripcion() + size);
		this.numero = tv.getDescripcion() + size;
		iDao.insert(ingreso);
		
		return "registroingreso";
	}
	
	public String registrarSalida() {
		IngresoDAO iDao = new IngresoDAO();
		Ingreso i = iDao.findByField("numero", ingreso.getNumero());
		PagoDao pDao = new PagoDao();
		List<Object> r = pDao.getEm().createNativeQuery("SELECT * FROM pago WHERE ingreso = " + i.getId()).getResultList();

		if (!r.isEmpty()) {
			i.setFechasalida(new Date());
			iDao.update(i);
			System.out.println("Salida exitosa");
			return "registroingreso";
		} else {
			System.out.println("No has realizado el pago");
			return "error";
		}
	}
/*
	public List<Tamanio> listarTamanio() {
		TamanioDao tDao = new TamanioDao();
		return tDao.list();
	}
	
}

*/