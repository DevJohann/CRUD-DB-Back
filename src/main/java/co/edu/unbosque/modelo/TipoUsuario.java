package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_usuario;
	
	@Column(name = "tipo_usuario")
	private String tipo_usuario;
	
	@Column(name = "permisos")
	private String permisos;

	public TipoUsuario() {
	
	}

	public TipoUsuario(Long id_tipo_usuario, String tipo_usuario, String permisos) {
		this.id_tipo_usuario = id_tipo_usuario;
		this.tipo_usuario = tipo_usuario;
		this.permisos = permisos;
	}

	public Long getId_tipo_usuario() {
		return id_tipo_usuario;
	}

	public void setId_tipo_usuario(Long id_tipo_usuario) {
		this.id_tipo_usuario = id_tipo_usuario;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	
	
}
