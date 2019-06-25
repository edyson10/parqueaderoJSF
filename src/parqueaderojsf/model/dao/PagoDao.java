package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Pago;
import parqueaderojsf.util.Conexion;

public class PagoDao extends Conexion<Pago> implements GenericDao<Pago>{

	public PagoDao() {
		super(Pago.class);
		// TODO Auto-generated constructor stub
	}
}
