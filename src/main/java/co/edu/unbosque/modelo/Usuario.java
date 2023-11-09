package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pswd")
	private String pswd;
	
	@Column(name = "id_tipo_usuario")
	private Long id_tipo_usuario;

	public Usuario() {

	}

	public Usuario(Long id_usuario, String username, String pswd, Long id_tipo_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.username = username;
		this.pswd = pswd;
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public Long getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Long id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}
	
	
}
