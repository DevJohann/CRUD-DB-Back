package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_cliente")
public class TipoCliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_cliente;
	
	@Column(name = "tipo_cliente")
	private String tipo_cliente;
	
	@Column(name = "beneficios")
	private String beneficios;

	public TipoCliente() {

	}
	
	public TipoCliente(Long id_tipo_cliente, String tipo_cliente, String beneficios) {
		this.id_tipo_cliente = id_tipo_cliente;
		this.tipo_cliente = tipo_cliente;
		this.beneficios = beneficios;
	}

	public Long getId_tipo_cliente() {
		return id_tipo_cliente;
	}

	public void setId_tipo_cliente(Long id_tipo_cliente) {
		this.id_tipo_cliente = id_tipo_cliente;
	}

	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
}
