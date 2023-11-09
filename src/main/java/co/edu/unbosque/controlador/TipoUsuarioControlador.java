package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.TipoUsuario;
import co.edu.unbosque.repositorio.TipoUsuarioRepositorio;

@RestController
@RequestMapping("/tipo_usuario")
public class TipoUsuarioControlador {
	@Autowired
	private TipoUsuarioRepositorio tipoUsuarioRepositorio;
	
	@GetMapping("/listar")
	public List<TipoUsuario> listarTipoUsuarioTodos(){
		return tipoUsuarioRepositorio.findAll();
	}
}
