package parqueaderojsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String clave;

	private String documento;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String nombre;

	private String usuario;

	//bi-directional many-to-one association to Accesocaja
	@OneToMany(mappedBy="usuarioBean")
	private List<Accesocaja> accesocajas;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="usuarioBean")
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="usuarioBean")
	private List<Pago> pagos;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="usuario")
	private List<Tarjeta> tarjetas;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="usuariorol"
		, joinColumns={
			@JoinColumn(name="idusuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idrol")
			}
		)
	private List<Rol> rols;

	public Usuario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<Accesocaja> getAccesocajas() {
		return this.accesocajas;
	}

	public void setAccesocajas(List<Accesocaja> accesocajas) {
		this.accesocajas = accesocajas;
	}

	public Accesocaja addAccesocaja(Accesocaja accesocaja) {
		getAccesocajas().add(accesocaja);
		accesocaja.setUsuarioBean(this);

		return accesocaja;
	}

	public Accesocaja removeAccesocaja(Accesocaja accesocaja) {
		getAccesocajas().remove(accesocaja);
		accesocaja.setUsuarioBean(null);

		return accesocaja;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setUsuarioBean(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setUsuarioBean(null);

		return cliente;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setUsuarioBean(this);

		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setUsuarioBean(null);

		return pago;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addTarjeta(Tarjeta tarjeta) {
		getTarjetas().add(tarjeta);
		tarjeta.setUsuario(this);

		return tarjeta;
	}

	public Tarjeta removeTarjeta(Tarjeta tarjeta) {
		getTarjetas().remove(tarjeta);
		tarjeta.setUsuario(null);

		return tarjeta;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

}