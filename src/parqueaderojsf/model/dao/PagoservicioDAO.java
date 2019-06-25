package parqueaderojsf.model.dao;

import parqueaderojsf.model.entities.Pagoservicio;
import parqueaderojsf.util.Conexion;

public class PagoservicioDAO extends Conexion<Pagoservicio> implements GenericDao<Pagoservicio>{

	public PagoservicioDAO() {
		super(Pagoservicio.class);
		// TODO Auto-generated constructor stub
	}
}
