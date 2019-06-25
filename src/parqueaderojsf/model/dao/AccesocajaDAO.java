package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Accesocaja;
import parqueaderojsf.util.Conexion;

public class AccesocajaDAO extends Conexion<Accesocaja> implements GenericDao<Accesocaja>{

	public AccesocajaDAO() {
		super(Accesocaja.class);
		// TODO Auto-generated constructor stub
	}
}
