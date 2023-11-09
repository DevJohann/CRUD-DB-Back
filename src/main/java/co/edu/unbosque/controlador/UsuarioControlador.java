package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Usuario;
import co.edu.unbosque.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping("/listar")
	public List<Usuario> listarTodoUsuario(){
		return usuarioRepositorio.findAll();
	}
}
