package co.edu.unbosque.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;
	
	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;
	
	@Column(name = "correo", nullable = false, unique = true)
	private String correo;
	
	@Column(name = "id_tipo_cliente", nullable = false)
	private long id_tipo_cliente;
	
	@Column(name = "id_vuelo", nullable = false)
	private long id_vuelo;
	
	public Cliente() {

	}

	public Cliente(long id, String nombre, String apellido, String correo, long id_tipo_cliente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.id_tipo_cliente = id_tipo_cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getId_tipo_cliente() {
		return id_tipo_cliente;
	}

	public void setId_tipo_cliente(long id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}

	public long getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(long id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
