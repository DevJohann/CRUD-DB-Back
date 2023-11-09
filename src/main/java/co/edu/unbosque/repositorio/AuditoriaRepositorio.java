package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Auditoria;

@Repository
public interface AuditoriaRepositorio extends JpaRepository<Auditoria, Long>{

}
