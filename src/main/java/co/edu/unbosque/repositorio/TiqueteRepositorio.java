package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Tiquete;

@Repository
public interface TiqueteRepositorio extends JpaRepository<Tiquete, Long>{

}
