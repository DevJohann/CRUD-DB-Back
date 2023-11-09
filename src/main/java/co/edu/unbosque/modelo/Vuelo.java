package co.edu.unbosque.modelo;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_vuelo;
	
	@Column(name = "referencia")
	private Integer referencia;
	
	@Column(name = "id_avion")
	private Integer id_avion;
	
	@Column(name = "fecha_salida")
	private Date fecha_salida;
	
	@Column(name = "fecha_llegada")
	private Date fecha_llegada;
	
	@Column(name = "cupo")
	private Integer cupo;
	
	@Column(name = "peso_max")
	private Integer peso_max;
	
	@Column(name = "maletas_max")
	private Integer maletas_max;

	public Vuelo() {
	
	}

	public Vuelo(Long id_vuelo, Integer referencia, Integer id_avion, Date fecha_salida, Date fecha_llegada,
			Integer cupo, Integer peso_max, Integer maletas_max) {
		this.id_vuelo = id_vuelo;
		this.referencia = referencia;
		this.id_avion = id_avion;
		this.fecha_salida = fecha_salida;
		this.fecha_llegada = fecha_llegada;
		this.cupo = cupo;
		this.peso_max = peso_max;
		this.maletas_max = maletas_max;
	}

	public Long getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(Long id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public Integer getReferencia() {
		return referencia;
	}

	public void setReferencia(Integer referencia) {
		this.referencia = referencia;
	}

	public Integer getId_avion() {
		return id_avion;
	}

	public void setId_avion(Integer id_avion) {
		this.id_avion = id_avion;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Date getFecha_llegada() {
		return fecha_llegada;
	}

	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}

	public Integer getCupo() {
		return cupo;
	}

	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}

	public Integer getPeso_max() {
		return peso_max;
	}

	public void setPeso_max(Integer peso_max) {
		this.peso_max = peso_max;
	}

	public Integer getMaletas_max() {
		return maletas_max;
	}

	public void setMaletas_max(Integer maletas_max) {
		this.maletas_max = maletas_max;
	}
	
}
