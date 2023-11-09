package co.edu.unbosque.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "auditoria")
public class Auditoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremental
	private Long id_auditoria;
	
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "resultado", nullable = false)
	private String resultado;

	public Auditoria() {

	}

	public Auditoria(Long id_auditoria, Date fecha, String descripcion, String resultado) {
		super();
		this.id_auditoria = id_auditoria;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.resultado = resultado;
	}

	public Long getId_auditoria() {
		return id_auditoria;
	}

	public void setId_auditoria(Long id_auditoria) {
		this.id_auditoria = id_auditoria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
	
}
