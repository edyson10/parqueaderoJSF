package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Ingreso;
import parqueaderojsf.util.Conexion;

public class IngresoDAO extends Conexion<Ingreso> implements GenericDao<Ingreso>{
	
	public IngresoDAO() {
		super(Ingreso.class);
		// TODO Auto-generated constructor stub
	}
}
