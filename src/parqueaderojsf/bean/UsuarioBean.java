/*
package com.parqueadero.jsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import com.parqueadero.jpa.dao.CajaDAO;
import com.parqueadero.jpa.dao.ClienteDAO;
import com.parqueadero.jpa.dao.PagoDao;
import com.parqueadero.jpa.dao.TarjetaDAO;
import com.parqueadero.jpa.dao.TipoclienteDAO;
import com.parqueadero.jpa.dao.UsuarioRolDAO;
import com.parqueadero.jpa.entity.Caja;
import com.parqueadero.jpa.entity.Cliente;
import com.parqueadero.jpa.entity.Pago;
import com.parqueadero.jpa.entity.Tarifa;
import com.parqueadero.jpa.entity.Tarjeta;
import com.parqueadero.jpa.entity.Tipocliente;
import com.parqueadero.jpa.entity.Usuario;
import com.parqueadero.jpa.entity.Usuariorol;

@ManagedBean(name = "bean2")
@RequestScoped
public class UsuarioBean {

	/************* Usuario Auxiliar
	private Usuario u= new Usuario();
	private Cliente c= new Cliente();
	
	private Cliente editar= new Cliente();
	private String fecha;
	
	private Tarjeta tarjeta= new Tarjeta();
	private String fechainciio, fecharetiro;
	
	private List<Cliente> filter;

	
	public void registrarCliente() {
			ClienteDAO dao= new ClienteDAO();
			c.setFechanacimiento(java.sql.Date.valueOf(fecha));
			c.setUsuario(1);
			dao.insert(c);
			c= new Cliente();
			fecha="";
	}
	
	public String editar(Cliente c) {
		this.editar=c;
		return "editar?faces-redirect=true";
	}
	
	public List<SelectItem> tiposUsuarios(){
		List<SelectItem> item= new ArrayList<>();
		SelectItemGroup s = new SelectItemGroup("Tipo Cliente");
		TipoclienteDAO daoT = new TipoclienteDAO ();
		List<Tipocliente> g = daoT.list();
		SelectItem[] items = new SelectItem[g.size()];
		for (int i = 0; i < g.size(); i++) {
			items[i] = new SelectItem("" + g.get(i).getId(), "" + g.get(i).getDescripcion());

		}
		s.setSelectItems(items);
		item.add(s);
		return item;
	}
	
	
	public void editarCliente() {
		ClienteDAO dao= new ClienteDAO();
		editar.setFechanacimiento(java.sql.Date.valueOf(fecha));
		dao.update(editar);
	}
	
	public void registrarTarifa() {
		tarjeta.setFechainicio(java.sql.Date.valueOf(fechainciio));
		TarjetaDAO dao= new TarjetaDAO();
		dao.insert(tarjeta);
	}
	
	public boolean esValida(Tarjeta t) {
		if(t.getUsuarioactivo()>0) {
			return true;
		}
		return false;
	}
	
	public int ingresosCajas() {
	    PagoDao dao= new PagoDao();
		List<Pago> c= dao.list();
		int valor=0;
		for(Pago a:c) {

			//valor+=a.getValor();
		}
		return valor;
	}
	
	
	public List<Cliente> clientes(){
		ClienteDAO dao= new ClienteDAO();
		return dao.list();
	}
	
	public Pago pagoCliente(Cliente d) {
		PagoDao dao= new PagoDao();
		return dao.findByFieldInt("usuario", d.getId());
	}

	
	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}


	public Cliente getEditar() {
		return editar;
	}


	public void setEditar(Cliente editar) {
		this.editar = editar;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}


	public String getFechainciio() {
		return fechainciio;
	}


	public void setFechainciio(String fechainciio) {
		this.fechainciio = fechainciio;
	}


	public String getFecharetiro() {
		return fecharetiro;
	}


	public void setFecharetiro(String fecharetiro) {
		this.fecharetiro = fecharetiro;
	}

	public List<Cliente> getFilter() {
		return filter;
	}

	public void setFilter(List<Cliente> filter) {
		this.filter = filter;
	}
}
*/