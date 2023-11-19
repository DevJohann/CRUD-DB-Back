package co.edu.unbosque.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{
	
	@Query(value = "SELECT Cliente.* FROM Cliente INNER JOIN Vuelo ON Cliente.id_vuelo = Vuelo.id_vuelo WHERE Cliente.id_vuelo = ?1", nativeQuery = true)
	List<Cliente> findAllByVuelo(int id_vuelo);
}
