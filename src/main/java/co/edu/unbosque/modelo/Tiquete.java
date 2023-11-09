package co.edu.unbosque.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tiquete")
public class Tiquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tiquete;
	
	@Column(name = "peso_equipaje")
	private Integer peso_equipaje;
	
	@Column(name = "cant_maletas")
	private Integer cant_maletas;
	
	@Column(name = "id_vuelo")
	private Integer id_vuelo;
	
	@Column(name = "id_cliente")
	private Integer id_client;
	
	@Column(name = "precio")
	private Integer precio;

	public Tiquete() {

	}

	public Tiquete(Long id_tiquete, Integer peso_equipaje, Integer cant_maletas, Integer id_vuelo, Integer id_client,
			Integer precio) {
		this.id_tiquete = id_tiquete;
		this.peso_equipaje = peso_equipaje;
		this.cant_maletas = cant_maletas;
		this.id_vuelo = id_vuelo;
		this.id_client = id_client;
		this.precio = precio;
	}

	public Long getId_tiquete() {
		return id_tiquete;
	}

	public void setId_tiquete(Long id_tiquete) {
		this.id_tiquete = id_tiquete;
	}

	public Integer getPeso_equipaje() {
		return peso_equipaje;
	}

	public void setPeso_equipaje(Integer peso_equipaje) {
		this.peso_equipaje = peso_equipaje;
	}

	public Integer getCant_maletas() {
		return cant_maletas;
	}

	public void setCant_maletas(Integer cant_maletas) {
		this.cant_maletas = cant_maletas;
	}

	public Integer getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(Integer id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
}
