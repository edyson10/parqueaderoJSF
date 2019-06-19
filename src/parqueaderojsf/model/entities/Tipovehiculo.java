package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipovehiculo database table.
 * 
 */
@Entity
@NamedQuery(name="Tipovehiculo.findAll", query="SELECT t FROM Tipovehiculo t")
public class Tipovehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Ingreso
	@OneToMany(mappedBy="tipovehiculo")
	private List<Ingreso> ingresos;

	//bi-directional many-to-one association to Tarifa
	@OneToMany(mappedBy="tipovehiculoBean")
	private List<Tarifa> tarifas;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="tipovehiculoBean")
	private List<Tarjeta> tarjetas;

	public Tipovehiculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Ingreso> getIngresos() {
		return this.ingresos;
	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public Ingreso addIngreso(Ingreso ingreso) {
		getIngresos().add(ingreso);
		ingreso.setTipovehiculo(this);

		return ingreso;
	}

	public Ingreso removeIngreso(Ingreso ingreso) {
		getIngresos().remove(ingreso);
		ingreso.setTipovehiculo(null);

		return ingreso;
	}

	public List<Tarifa> getTarifas() {
		return this.tarifas;
	}

	public void setTarifas(List<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}

	public Tarifa addTarifa(Tarifa tarifa) {
		getTarifas().add(tarifa);
		tarifa.setTipovehiculoBean(this);

		return tarifa;
	}

	public Tarifa removeTarifa(Tarifa tarifa) {
		getTarifas().remove(tarifa);
		tarifa.setTipovehiculoBean(null);

		return tarifa;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addTarjeta(Tarjeta tarjeta) {
		getTarjetas().add(tarjeta);
		tarjeta.setTipovehiculoBean(this);

		return tarjeta;
	}

	public Tarjeta removeTarjeta(Tarjeta tarjeta) {
		getTarjetas().remove(tarjeta);
		tarjeta.setTipovehiculoBean(null);

		return tarjeta;
	}

}