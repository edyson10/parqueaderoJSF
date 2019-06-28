package parqueadero.DAO;

import parqueadero.entities.Usuariorol;
import parqueadero.util.Conexion;


public class UsuarioRolDao extends Conexion<Usuariorol> implements GenericDao<Usuariorol>{
	
	public UsuarioRolDao() {
		super(Usuariorol.class);
		// TODO Auto-generated constructor stub
	}

}
