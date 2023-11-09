package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Tiquete;
import co.edu.unbosque.modelo.Tripulacion;
import co.edu.unbosque.repositorio.TiqueteRepositorio;
import co.edu.unbosque.repositorio.TripulacionRepositorio;

@RestController
@RequestMapping("/tiquete")
public class TiqueteControlador {
	
	@Autowired
	private TiqueteRepositorio tiqueteRepositorio;
	
	@GetMapping("/listar")
	public List<Tiquete> listarTiqueteTodo(){
		return tiqueteRepositorio.findAll();
	}
}
