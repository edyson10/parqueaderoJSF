package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Tipotarifa;
import parqueaderojsf.util.Conexion;

public class TipotarifaDAO extends Conexion<Tipotarifa> implements GenericDao<Tipotarifa>{

	public TipotarifaDAO() {
		super(Tipotarifa.class);
		// TODO Auto-generated constructor stub
	}
}
