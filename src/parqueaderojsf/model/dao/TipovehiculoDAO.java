package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Tipovehiculo;
import parqueaderojsf.util.Conexion;

public class TipovehiculoDAO extends Conexion<Tipovehiculo> implements GenericDao<Tipovehiculo> {

	public TipovehiculoDAO() {
		super(Tipovehiculo.class);
		// TODO Auto-generated constructor stub
	}
}
