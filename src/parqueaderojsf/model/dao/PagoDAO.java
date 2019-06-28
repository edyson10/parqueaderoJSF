package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Pago;
import parqueaderojsf.util.Conexion;

public class PagoDAO extends Conexion<Pago> implements GenericDao<Pago> {
	
	public PagoDAO() {
		super(Pago.class);
		// TODO Auto-generated constructor stub
	}
}
