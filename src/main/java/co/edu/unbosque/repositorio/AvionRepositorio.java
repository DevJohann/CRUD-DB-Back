package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Avion;

@Repository
public interface AvionRepositorio extends JpaRepository<Avion, Long>{

}
