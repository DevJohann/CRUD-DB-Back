package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_avion;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "licencia")
	private String licencia;
	
	@Column(name = "id_tripulacion")
	private Long id_tripulacion;

	public Avion() {
		
	}

	public Avion(Long id_avion, String marca, String licencia, Long id_tripulacion) {
		this.id_avion = id_avion;
		this.marca = marca;
		this.licencia = licencia;
		this.id_tripulacion = id_tripulacion;
	}

	public Long getId_avion() {
		return id_avion;
	}

	public void setId_avion(Long id_avion) {
		this.id_avion = id_avion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Long getId_tripulacion() {
		return id_tripulacion;
	}

	public void setId_tripulacion(Long id_tripulacion) {
		this.id_tripulacion = id_tripulacion;
	}
	
	
}
