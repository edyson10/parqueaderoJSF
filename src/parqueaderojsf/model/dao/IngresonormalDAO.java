package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Ingresonormal;
import parqueaderojsf.util.Conexion;

public class IngresonormalDAO extends Conexion<Ingresonormal> implements GenericDao<Ingresonormal> {

	public IngresonormalDAO() {
		super(Ingresonormal.class);
		// TODO Auto-generated constructor stub
	}
}
