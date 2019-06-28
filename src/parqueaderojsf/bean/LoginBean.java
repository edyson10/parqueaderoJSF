package parqueaderojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import parqueaderojsf.model.dao.RolDAO;
import parqueaderojsf.model.dao.UsuarioDAO;
import parqueaderojsf.model.dao.UsuarioRolDAO;
import parqueaderojsf.model.entities.Rol;
import parqueaderojsf.model.entities.Usuario;

@ManagedBean(name = "loginbean")
@SessionScoped
public class LoginBean {
  
	private Usuario usuario = new Usuario();
	private Usuario validado = null;
	private String fecha;
	private Integer comboRol;
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
	
	public Integer getComboRol() {
		return comboRol;
	}
	public void setComboRol(Integer comboRol) {
		this.comboRol = comboRol;
	}
	
	public String iniciarSesion() {
		UsuarioDAO uDao = new UsuarioDAO();
		//RolDAO rDao = new RolDAO();
		//UsuarioRolDAO urDao = new UsuarioRolDAO();
		Usuario u = uDao.findByField("usuario", usuario.getUsuario());
		if(u != null) {
			if(u.getUsuario().equalsIgnoreCase(usuario.getUsuario())) {
				this.validado = u;
				HttpSession session = (HttpSession) javax.faces.context.FacesContext.getCurrentInstance().getExternalContext()
						.getSession(true);
				if(comboRol == 1) {
					session.setAttribute("usuario", validado.getUsuario());
					session.setAttribute("clave", validado.getClave());
					session.setAttribute("rol", 1);
					return "admin";
				}
				else if(comboRol == 2) {
					session.setAttribute("usuario", validado.getUsuario());
					session.setAttribute("clave", validado.getClave());
					session.setAttribute("rol", 2);
					return "registrar";
				}
				else if(comboRol == 3) {
					session.setAttribute("usuario", validado.getUsuario());
					session.setAttribute("clave", validado.getClave());
					session.setAttribute("rol", 3);
					return "caja";
				}
				else{
					session.setAttribute("usuario", validado.getUsuario());
					session.setAttribute("clave", validado.getClave());
					session.setAttribute("rol", 4);
					return "IngresoVehiculo";
				}
			}else {
				this.validado = null;
				this.alerta = "Error al iniciar sesión: credenciales inválidas";
				return "index";
			}
		}else {
			return "index";
		}
	}
	
	public String logout() {
		if (this.validado != null) {
			HttpSession session = (HttpSession) javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSession(false);
			session.invalidate();
			this.validado = null;
			this.alerta = "";
			this.alerta2 = "";
			System.out.println("Cerrar Sesiom");
			return "index";
		} else {
			System.out.println("No hay Sesiom");
			return "index";
		}
	}
}
