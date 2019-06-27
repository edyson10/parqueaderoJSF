package parqueaderojsf.bean;

/*
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.parqueadero.jpa.dao.CajaDAO;
import com.parqueadero.jpa.dao.TarifaDAO;
import com.parqueadero.jpa.dao.TipotarifaDAO;
import com.parqueadero.jpa.dao.TipovehiculoDAO;
import com.parqueadero.jpa.dao.UsuarioDAO;
import com.parqueadero.jpa.dao.UsuarioRolDAO;
import com.parqueadero.jpa.entity.Caja;
import com.parqueadero.jpa.entity.Tarifa;
import com.parqueadero.jpa.entity.Tipotarifa;
import com.parqueadero.jpa.entity.Tipovehiculo;
import com.parqueadero.jpa.entity.Usuario;
import com.parqueadero.jpa.entity.Usuariorol;

@ManagedBean
@SessionScoped
public class AdministradorBean {

	Usuario usuario= new Usuario();
	Caja caja= new Caja();
	Tarifa tarifa= new Tarifa();
	Usuario usuariovalidado = null;
	private String comboTipoVehiculo;
	private String comboTarifa;
	
	private List<Usuario> filter;

	public AdministradorBean() {
		// TODO Auto-generated constructor stub
	}
	
	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public Usuario getUsuariovalidado() {
		return usuariovalidado;
	}

	public void setUsuariovalidado(Usuario usuariovalidado) {
		this.usuariovalidado = usuariovalidado;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getComboTipoVehiculo() {
		return comboTipoVehiculo;
	}

	public void setComboTipoVehiculo(String comboTipoVehiculo) {
		this.comboTipoVehiculo = comboTipoVehiculo;
	}
	
	public String getComboTarifa() {
		return comboTarifa;
	}

	public void setComboTarifa(String comboTarifa) {
		this.comboTarifa = comboTarifa;
	}

	public String loginAdministrador() {
		
		String cadena = "Error";

		UsuarioDAO uDao = new UsuarioDAO();
		Usuario u = uDao.findByField("email", usuario.getEmail());
		System.out.println(u.getNombre());
//		UsuarioRolDao uRol=new  UsuarioRolDao();
//		Usuariorol urol= new Usuariorol();
//		urol=uRol.find(1);
		
		
		if (u != null) {
			if (u.getClave().contentEquals(usuario.getClave())) {
				System.out.println("entroooooo");
				this.usuariovalidado = u;
				System.out.println("se logeo");
				return "exito";	             
			} 

		}
			return cadena;
		}
	
	public String registrarUsuarios() {
		
		String cadena="error";
		Usuario u = new Usuario();
		u.setNombre(usuario.getNombre());
		u.setClave(usuario. getClave());
		u.setEmail(usuario.getEmail());
		u.setDocumento(usuario.getDocumento());
		u.setFechanacimiento(usuario.getFechanacimiento());
		
		if(u!=null) {
			UsuarioDAO uDao= new UsuarioDAO();
			uDao.insert(u);
		}
		return "exito";
	}
	
	public String registrarCaja() {
		String cadena="error";
		Caja c= new Caja();
		c.setDescripcion(caja.getDescripcion());
		if(c!=null) {
			CajaDAO cDao = new CajaDAO();
			cDao.insert(c);
		}
		return cadena;
	}

	public String registrarTarifa() {
		String cadena= "error";
		Tarifa t = new Tarifa();
		t.setDescripcion(tarifa.getDescripcion());
		t.setFechainicio(new Date());
		t.setFechafin(new Date());
			
		TipovehiculoDAO tvDao = new TipovehiculoDAO();
		Tipovehiculo tv =  tvDao.find(Integer.parseInt(comboTipoVehiculo));
		t.setTipovehiculo(tv.getId());
		
		TipotarifaDAO ttDao= new TipotarifaDAO();
		Tipotarifa tt = ttDao.find(Integer.parseInt(comboTarifa));
		t.setTipotarifa(tt.getId());
		
		if(t!=null) {
			TarifaDAO tDao = new TarifaDAO();
			tDao.insert(t);
		}
		
		return "registrotarifa";
	}
	
	public List<Usuario> listarUsuarios() {
		UsuarioDAO uDao= new UsuarioDAO();
		return uDao.list();
	}
	
	public String asignarRoles(Usuario u,int id) {
		
		Usuariorol usuariorol= new Usuariorol();
		UsuarioRolDAO usuariorolDao = new UsuarioRolDAO();
		
		usuariorol.setIdrol(id);
		usuariorol.setIdusuario(u.getId());
		usuariorolDao.insert(usuariorol);
		return "exito";
	}
	
	public String EditarContraseña(Usuario u, String contraseña) {
		
		Usuario usu = new Usuario();
		UsuarioDAO uDao=new UsuarioDAO();
		usu.setClave(contraseña);
		usu.setId(u.getId());
		uDao.update(usu);
		return "exito";
	}

	public List<Usuario> getFilter() {
		return filter;
	}

	public void setFilter(List<Usuario> filter) {
		this.filter = filter;
	}

}

*/