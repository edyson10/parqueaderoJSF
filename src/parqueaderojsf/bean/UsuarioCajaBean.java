package parqueaderojsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import parqueaderojsf.model.dao.PagoDAO;
import parqueaderojsf.model.entities.Ingreso;
import parqueaderojsf.model.entities.Pago;

@ManagedBean(name = "usuarioCajaBean")
@RequestScoped
public class UsuarioCajaBean {
	
	private Ingreso salir = new Ingreso();
	private Pago pago= new Pago();

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
	
	public List<Pago> listarPagos() {
		PagoDAO pDao = new PagoDAO();
		return pDao.list();
	}
}