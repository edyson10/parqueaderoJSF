package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Caja;
import parqueaderojsf.util.Conexion;

public class CajaDAO extends Conexion<Caja> implements GenericDao<Caja> {

	public CajaDAO() {
		super(Caja.class);
		// TODO Auto-generated constructor stub
	}
}
