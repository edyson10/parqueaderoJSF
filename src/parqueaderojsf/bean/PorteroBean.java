package parqueaderojsf.bean;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import parqueaderojsf.model.dao.IngresoDAO;
import parqueaderojsf.model.dao.IngresonormalDAO;
import parqueaderojsf.model.dao.IngresotarjetaDAO;
import parqueaderojsf.model.dao.PagoDAO;
import parqueaderojsf.model.dao.TarjetaDAO;
import parqueaderojsf.model.dao.TipovehiculoDAO;
import parqueaderojsf.model.entities.Ingreso;
import parqueaderojsf.model.entities.Ingresonormal;
import parqueaderojsf.model.entities.Ingresotarjeta;
import parqueaderojsf.model.entities.Tarjeta;
import parqueaderojsf.model.entities.Tipovehiculo;

@ManagedBean
@SessionScoped
public class PorteroBean {
	private Ingreso ingreso = new Ingreso();
	private Integer comboTipoIngreso;
	private String rfid;
	private String ticket = "";
	String alerta = "";
	
	public Ingreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}
	
	public Integer getComboTipoIngreso() {
		return comboTipoIngreso;
	}

	public void setComboTipoIngreso(Integer comboTipoIngreso) {
		this.comboTipoIngreso = comboTipoIngreso;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getNumero() {
		return ticket;
	}

	public void setNumero(String numero) {
		this.ticket = numero;
	}
	
	public String getAlerta() {
		return alerta;
	}

	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}

	public String ingresoCarro() {
			Ingreso ingresoNuevo = new Ingreso();
			IngresoDAO iDao = new IngresoDAO();
			TipovehiculoDAO tvDao = new TipovehiculoDAO();
			
			Tipovehiculo tv =  tvDao.find(1);
			System.out.println(tv.getDescripcion());
			ingresoNuevo.setTipovehiculo(tv);
			ingresoNuevo.setFechaingreso(new Date());
			Integer size = iDao.list().size();
			ingresoNuevo.setNumero(tv.getDescripcion() + size);
			this.ticket= tv.getDescripcion() + size;	
			iDao.insert(ingresoNuevo);
			
		if(comboTipoIngreso==1) {
			Ingreso ite = iDao.findByField("numero", ingresoNuevo.getNumero());
			IngresonormalDAO inDao = new IngresonormalDAO();
			Ingresonormal in =  new Ingresonormal();
			in.setId(ite.getId());
			inDao.insert(in);
			return "IngresoVehiculo";
		}
		else {
			Ingreso ite = iDao.findByField("numero", ingresoNuevo.getNumero());
			IngresotarjetaDAO itDao = new IngresotarjetaDAO();
			Ingresotarjeta it =  new Ingresotarjeta();
			TarjetaDAO tDao = new TarjetaDAO();
			Tarjeta t = tDao.find(rfid);
			it.setId(ite.getId());
			it.setTarjetaBean(t);
			itDao.insert(it);
			return "IngresoVehiculo";
		}
	}
	
	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String ingresoMoto() {
		Ingreso ingresoNuevo = new Ingreso();
		IngresoDAO iDao = new IngresoDAO();
		TipovehiculoDAO tvDao = new TipovehiculoDAO();
		
		Tipovehiculo tv =  tvDao.find(2);
		System.out.println(tv.getDescripcion());
		ingresoNuevo.setTipovehiculo(tv);
		
		ingresoNuevo.setFechaingreso(new Date());
		
		Integer size = iDao.list().size();
		ingresoNuevo.setNumero(tv.getDescripcion() + size);
		this.ticket= tv.getDescripcion() + size;	
		
		iDao.insert(ingresoNuevo);
		
	if(comboTipoIngreso==1) {
		Ingreso ite = iDao.findByField("numero", ingresoNuevo.getNumero());
		IngresonormalDAO inDao = new IngresonormalDAO();
		Ingresonormal in =  new Ingresonormal();
		in.setId(ite.getId());
		inDao.insert(in);
		
		return "IngresoVehiculo";
	}
	else {
		Ingreso ite = iDao.findByField("numero", ingresoNuevo.getNumero());
		IngresotarjetaDAO itDao = new IngresotarjetaDAO();
		Ingresotarjeta it =  new Ingresotarjeta();
		TarjetaDAO tDao = new TarjetaDAO();
		Tarjeta t = tDao.find(rfid);
		it.setId(ite.getId());
		it.setTarjetaBean(t);
		itDao.insert(it);
		return "IngresoVehiculo";
	}
	}
	
	public String salida() {
		IngresoDAO iDao = new IngresoDAO();
		Ingreso i = iDao.findByField("numero", ingreso.getNumero());
		PagoDAO pDao = new PagoDAO();
		List<Object> r = pDao.getEm().createNativeQuery("SELECT * FROM pago WHERE ingreso = " + i.getId()).getResultList();

		if (!r.isEmpty()) {
			i.setFechasalida(new Date());
			iDao.update(i);
			System.out.println("Salida exitosa");
			this.alerta = "Salida exitosa";
			return "registroingreso";
		} else {
			System.out.println("No has realizado el pago");
			this.alerta = "No has realizado el pago";
			return "error";
		}
	}
	/*

	public List<Tamanio> listarTamanio() {
		TamanioDao tDao = new TamanioDao();
		return tDao.list();
	}
	*/
}