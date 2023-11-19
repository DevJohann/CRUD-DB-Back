package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.excepciones.ResourceNotFoundException;
import co.edu.unbosque.modelo.Cliente;
import co.edu.unbosque.repositorio.ClienteRepositorio;

@RestController //API REST
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClienteControlador {
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	@GetMapping("/listar") //Método mapeado con "/listar"
	public List<Cliente> listarTodosClientes(){
		return repositorio.findAll();
	}
	
	//Método para traer los pasajeros de un vuelo
	@GetMapping("/{id_vuelo}")
	public List<Cliente> listarPasajeros(@PathVariable int id_vuelo){
		return repositorio.findAllByVuelo(id_vuelo);
	}
	
	//Confirmar un cliente
	@PutMapping("/confirmar/{id_pasajero}")
	public ResponseEntity<Cliente> confirmarPasajeroPorID(@PathVariable Long id_pasajero, @RequestBody Cliente cliente){
		//System.out.println("Entra");
		Cliente clienteAct = repositorio.findById(id_pasajero).orElseThrow(() -> new ResourceNotFoundException("No existe el pasajero con el ID: " + id_pasajero));
		
		clienteAct.setConfirmado(cliente.isConfirmado());
		clienteAct.setNombre(cliente.getNombre());
		clienteAct.setApellido(cliente.getApellido());
		clienteAct.setCorreo(cliente.getCorreo());
		clienteAct.setId_tipo_cliente(cliente.getId_tipo_cliente());
		clienteAct.setId_vuelo(cliente.getId_vuelo());
		
		Cliente clienteActualizado = repositorio.save(clienteAct);
		
		return ResponseEntity.ok(clienteActualizado);
	}
	
	//Buscar un cliente
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Cliente> obtenerClientePorID(@PathVariable Long id){
		
		Cliente cliente = repositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el cliente con ID: " + id));
		
		return ResponseEntity.ok(cliente);
	}
}
