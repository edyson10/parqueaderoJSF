
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import parqueaderojsf.model.entities.Usuario;

@ManagedBean(name = "bean1")
@SessionScoped
public class LoginBean {
  
	private Usuario usuario= new Usuario();
	private Usuario validado= null;
	private String fecha;
	
	public String logearse() {
		if (validado == null) {
			FacesMessage message = null;
			UsuarioDAO daoU = new UsuarioDAO();

			Usuario us = daoU.findByField("email", usuario.getEmail());
			if (us != null) {
				if (usuario.getClave().contentEquals(us.getClave())) {
					this.validado = us;
					this.usuario = new Usuario();
					return "inicio?faces-redirect=true";
				} else {
					message = new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Contraseña Incorrecta");
				}
			} else {
				message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "REGISTRASE", "Usuario No existe");
			}
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		return "login?faces-redirect=true";
	}
	
	public String registrarse() {
		FacesMessage message = null;
		UsuarioDAO daoU = new UsuarioDAO();
		Usuario us = daoU.findByField("email", usuario.getEmail());
		if (us == null) {
			usuario.setFechanacimiento(java.sql.Date.valueOf(fecha));
			daoU.insert(usuario);
			this.usuario = new Usuario();
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success",
					"Te registrarse correctamente ahora inicia sesion");
		} else {
			message = new FacesMessage(FacesMessage.SEVERITY_WARN, "", "Email ya en USO");
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
		PrimeFaces.current().ajax().addCallbackParam("loggeddIn", (us != null) ? true : false);
		return "logi?faces-redirect=truen";
	}
	
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
}
