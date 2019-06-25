package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Pagomensual;
import parqueaderojsf.util.Conexion;

public class PagomensualDAO extends Conexion<Pagomensual> implements GenericDao<Pagomensual>{

	public PagomensualDAO() {
		super(Pagomensual.class);
		// TODO Auto-generated constructor stub
	}
}
