package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Tripulacion;

@Repository
public interface TripulacionRepositorio extends JpaRepository<Tripulacion, Long>{

}
