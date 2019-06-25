package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Tarjeta;
import parqueaderojsf.util.Conexion;

public class TarjetaDAO extends Conexion<Tarjeta> implements GenericDao<Tarjeta>{

	public TarjetaDAO() {
		super(Tarjeta.class);
		// TODO Auto-generated constructor stub
	}
}
