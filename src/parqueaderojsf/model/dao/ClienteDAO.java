package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Cliente;
import parqueaderojsf.util.Conexion;

public class ClienteDAO extends Conexion<Cliente> implements GenericDao<Cliente> {
	
	public ClienteDAO() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}
}