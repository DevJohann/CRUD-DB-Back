package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.TipoCliente;

@Repository
public interface TipoClienteRepositorio extends JpaRepository<TipoCliente, Long>{

}
