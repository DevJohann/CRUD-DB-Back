package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.TipoCliente;
import co.edu.unbosque.repositorio.TipoClienteRepositorio;

@RestController
@RequestMapping("/tipo_cliente")
public class TipoClienteControlador {

	@Autowired
	private TipoClienteRepositorio tipoClienteRepositorio;
	
	@GetMapping("/listar")
	public List<TipoCliente> listarTipoClienteTodo(){
		return tipoClienteRepositorio.findAll();
	}
}
