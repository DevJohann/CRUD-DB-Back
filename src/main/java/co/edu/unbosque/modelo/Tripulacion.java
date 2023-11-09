package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tripulacion")
public class Tripulacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tripulacion;
	
	@Column(name = "piloto")
	private String piloto;
	
	@Column(name = "auxiliar")
	private String auxiliar;
	
	@Column(name = "licencia")
	private String licencia;

	public Tripulacion() {

	}

	public Tripulacion(Long id_tripulacion, String piloto, String auxiliar, String licencia) {
		this.id_tripulacion = id_tripulacion;
		this.piloto = piloto;
		this.auxiliar = auxiliar;
		this.licencia = licencia;
	}

	public Long getId_tripulacion() {
		return id_tripulacion;
	}

	public void setId_tripulacion(Long id_tripulacion) {
		this.id_tripulacion = id_tripulacion;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	
	

}
