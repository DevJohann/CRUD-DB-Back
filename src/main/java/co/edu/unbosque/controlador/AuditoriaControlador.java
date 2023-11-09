package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.modelo.Auditoria;
import co.edu.unbosque.repositorio.AuditoriaRepositorio;

@RestController
@RequestMapping("/auditoria")
public class AuditoriaControlador {
	
	@Autowired
	private AuditoriaRepositorio auditoriaRepositorio;
	
	@GetMapping("/listar")
	public List<Auditoria> listarTodoAuditoria(){
		return auditoriaRepositorio.findAll();
	}
}
