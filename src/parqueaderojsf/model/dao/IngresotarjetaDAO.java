package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Ingresotarjeta;
import parqueaderojsf.util.Conexion;

public class IngresotarjetaDAO extends Conexion<Ingresotarjeta> implements GenericDao<Ingresotarjeta>{
	
	public IngresotarjetaDAO() {
		super(Ingresotarjeta.class);
		// TODO Auto-generated constructor stub
	}
}
