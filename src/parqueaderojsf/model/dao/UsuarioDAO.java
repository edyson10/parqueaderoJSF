package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Usuario;
import parqueaderojsf.util.Conexion;

public class UsuarioDAO extends Conexion<Usuario> implements GenericDao<Usuario>{
	
	public UsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

}
