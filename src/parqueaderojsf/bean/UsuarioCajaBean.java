/*

package com.parqueadero.jsf.bean;


import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.parqueadero.jpa.dao.PagoDao;
import com.parqueadero.jpa.entity.Ingreso;
import com.parqueadero.jpa.entity.Pago;

@ManagedBean(name = "bean3")
@RequestScoped
public class UsuarioCajaBean {
	
	private Ingreso salir = new Ingreso();
	private Pago pago= new Pago();

	@PostConstruct
	public Pago pago() {
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		int tmp = Integer.parseInt(mes);
		mes = (tmp < 10) ? "0" + tmp : "" + tmp;
		String fechaactual = annio + "-" + mes + "-" + dia;
		salir.setFechasalida(java.sql.Date.valueOf(fechaactual));
		
		int result=salir.getFechaingreso().getDay()-c.get(Calendar.DATE);
		Pago pago= new Pago();
		PagoDao dao= new PagoDao();
		
	    pago.setFecha((java.sql.Date.valueOf(fechaactual)));
	    //pago.setValor(result);
	    
	    dao.insert(pago);
	    this.pago=pago;
		return pago;
	}
	
	public Pago pagoMensul() {
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		int tmp = Integer.parseInt(mes);
		mes = (tmp < 10) ? "0" + tmp : "" + tmp;
		String fechaactual = annio + "-" + mes + "-" + dia;
		salir.setFechasalida(java.sql.Date.valueOf(fechaactual));
		
		int result=salir.getFechaingreso().getMonth()-c.get(Calendar.MONTH);
		Pago pago= new Pago();
		PagoDao dao= new PagoDao();
		
	    pago.setFecha((java.sql.Date.valueOf(fechaactual)));
	    //pago.setValor(result);
	    
	    dao.insert(pago);
		return pago;
	}

	public Ingreso getSalir() {
		return salir;
	}

	public void setSalir(Ingreso salir) {
		this.salir = salir;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}	
}
*/