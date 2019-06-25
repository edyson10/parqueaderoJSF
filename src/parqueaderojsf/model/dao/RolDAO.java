package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Rol;
import parqueaderojsf.util.Conexion;

public class RolDAO extends Conexion<Rol> implements GenericDao<Rol> {

	public RolDAO() {
		super(Rol.class);
		// TODO Auto-generated constructor stub
	}
}
