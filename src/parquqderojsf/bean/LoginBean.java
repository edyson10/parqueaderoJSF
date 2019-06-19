package parquqderojsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	
	/*
	Heroe heroe = new Heroe();
	
	Heroe heroeValidado = null;

	public Heroe getHeroe() {
		return heroe;
	}

	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}
	
	public Heroe getHeroeValidado() {
		return heroeValidado;
	}

	public void setHeroeValidado(Heroe heroeValidado) {
		this.heroeValidado = heroeValidado;
	}

	public String validar() {
		
		System.out.println(heroe.getNombre());
		HeroeDao hDao = new HeroeDao();
		Heroe h = hDao.findByField("nombre", heroe.getNombre());
		
		if(h!=null) {
			if(h.getHeroe().contentEquals(heroe.getHeroe())){
				this.heroeValidado = h;
				return "home";
			}
		}
		this.heroeValidado = null;	
		return "error";
	}
	
	public Boolean permiso(){
		if(this.heroeValidado == null) {
			return false;
		}
		return true;	
	}
	
		*/
}
