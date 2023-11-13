package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	Usuario findByUsername(String username);
}
