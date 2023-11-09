package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Avion;
import co.edu.unbosque.repositorio.AvionRepositorio;

@RestController
@RequestMapping("/avion")
public class AvionControlador {
	
	@Autowired
	private AvionRepositorio avionRepositorio;
	
	@GetMapping("/listar")
	public List<Avion> listarAvionTodos(){
		return avionRepositorio.findAll();
	}
}
