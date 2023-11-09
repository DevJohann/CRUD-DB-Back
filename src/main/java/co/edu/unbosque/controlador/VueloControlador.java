package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Vuelo;
import co.edu.unbosque.repositorio.VueloRepositorio;

@RestController
@RequestMapping("/vuelo")
public class VueloControlador {
	
	@Autowired
	private VueloRepositorio vueloRepositorio;
	
	@GetMapping("/listar")
	public List<Vuelo> listarVueloTodo(){
		return vueloRepositorio.findAll();
	}
}
