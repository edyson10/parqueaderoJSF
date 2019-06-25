package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Tarifa;
import parqueaderojsf.util.Conexion;

public class TarifaDAO extends Conexion<Tarifa> implements GenericDao<Tarifa>{

	public TarifaDAO() {
		super(Tarifa.class);
		// TODO Auto-generated constructor stub
	}
}
