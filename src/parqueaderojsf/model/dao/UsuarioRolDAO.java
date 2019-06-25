package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.*;
import parqueaderojsf.util.Conexion;

public class UsuarioRolDAO extends Conexion<Usuariorol> implements GenericDao<Usuariorol>{
	
	public UsuarioRolDAO() {
		super(Usuariorol.class);
		// TODO Auto-generated constructor stub
	}

}