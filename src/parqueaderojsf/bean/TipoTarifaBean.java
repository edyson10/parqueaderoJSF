package parqueaderojsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import parqueaderojsf.model.dao.TipotarifaDAO;
import parqueaderojsf.model.entities.Tipotarifa;

@ManagedBean(name = "tarifaBean")
@SessionScoped
public class TipoTarifaBean {
	private Tipotarifa tipotarifa = new Tipotarifa();
	
	public Tipotarifa getTipotarifa() {
		return tipotarifa;
	}

	public void setTipotarifa(Tipotarifa tipotarifa) {
		this.tipotarifa = tipotarifa;
	}

	public List<Tipotarifa> listarTipoTarifa() {		
		TipotarifaDAO ttDao = new TipotarifaDAO();
		return ttDao.list();
	}
}
