package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String direccion;

	private String documento;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Tipocliente
	@ManyToOne
	@JoinColumn(name="tipocliente")
	private Tipocliente tipoclienteBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuarioBean;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="clienteBean")
	private List<Tarjeta> tarjetas;

	public Cliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Tipocliente getTipoclienteBean() {
		return this.tipoclienteBean;
	}

	public void setTipoclienteBean(Tipocliente tipoclienteBean) {
		this.tipoclienteBean = tipoclienteBean;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addTarjeta(Tarjeta tarjeta) {
		getTarjetas().add(tarjeta);
		tarjeta.setClienteBean(this);

		return tarjeta;
	}

	public Tarjeta removeTarjeta(Tarjeta tarjeta) {
		getTarjetas().remove(tarjeta);
		tarjeta.setClienteBean(null);

		return tarjeta;
	}

}