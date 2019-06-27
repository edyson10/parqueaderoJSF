package parqueaderojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import parqueaderojsf.model.dao.UsuarioDAO;
import parqueaderojsf.model.entities.Usuario;

@ManagedBean(name = "loginbean")
@SessionScoped
public class LoginBean {
  
	private Usuario usuario = new Usuario();
	private Usuario validado = null;
	private String fecha;
	String alerta = "";
	String alerta2 = "";
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getValidado() {
		return validado;
	}
	public void setValidado(Usuario validado) {
		this.validado = validado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getAlerta() {
		return alerta;
	}

	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}
	
	public String getAlerta2() {
		return alerta2;
	}

	public void setAlerta2(String alerta2) {
		this.alerta2 = alerta2;
	}
	
	public String iniciarSesion() {
		UsuarioDAO uDao = new UsuarioDAO();
		System.out.println("Entro");
		System.out.println(usuario.getUsuario());
		Usuario u = uDao.findByField("usuario", usuario.getUsuario());
		if(u != null) {
			if(u.getUsuario().equalsIgnoreCase(usuario.getUsuario())) {
				this.validado = u;
				HttpSession session = (HttpSession) javax.faces.context.FacesContext.getCurrentInstance().getExternalContext()
						.getSession(true);
				session.setAttribute("usuario", validado.getUsuario());
				session.setAttribute("clave", validado.getClave());
				return "IngresoVehiculo";
			}else {
				this.validado = null;
				this.alerta = "Error al iniciar sesión: credenciales inválidas";
				return "index";
			}
		}else {
			return "index";
		}
	}
}
