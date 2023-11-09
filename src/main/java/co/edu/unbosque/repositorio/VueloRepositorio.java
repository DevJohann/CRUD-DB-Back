package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Vuelo;

@Repository
public interface VueloRepositorio extends JpaRepository<Vuelo, Long>{

}
