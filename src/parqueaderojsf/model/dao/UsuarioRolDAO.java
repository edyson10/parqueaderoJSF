package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Usuariorol;
import parqueaderojsf.util.Conexion;

public class UsuarioRolDAO extends Conexion<Usuariorol> implements GenericDao<Usuariorol>{
	
	public UsuarioRolDAO() {
		super(Usuariorol.class);
		// TODO Auto-generated constructor stub
	}

}
