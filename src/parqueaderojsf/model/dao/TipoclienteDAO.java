package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Tipocliente;
import parqueaderojsf.util.Conexion;

public class TipoclienteDAO extends Conexion<Tipocliente> implements GenericDao<Tipocliente> {

	public TipoclienteDAO() {
		super(Tipocliente.class);
		// TODO Auto-generated constructor stub
	}
}
