package parqueaderojsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import parqueaderojsf.model.dao.RolDAO;
import parqueaderojsf.model.entities.Rol;



@ManagedBean
@SessionScoped
public class RolBean {
	private Rol rol = new Rol();
	
	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Rol> listarRol() {		
		RolDAO rDao = new RolDAO();
		return rDao.list();
	}
}