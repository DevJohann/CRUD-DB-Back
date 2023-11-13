package co.edu.unbosque.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.excepciones.ResourceNotFoundException;
import co.edu.unbosque.modelo.Vuelo;
import co.edu.unbosque.repositorio.VueloRepositorio;

@RestController
@RequestMapping("/vuelo")
@CrossOrigin(origins = "http://localhost:4200/") //Permite intercambiar recursos entre backend y frontend
public class VueloControlador {
	
	@Autowired
	private VueloRepositorio vueloRepositorio;
	
	//Este método lista todos los vuelos
	@GetMapping("/listar")
	public List<Vuelo> listarVueloTodo(){
		return vueloRepositorio.findAll();
	}
	
	@PostMapping("/guardar") //Para recibir peticiones POST (Guardar datos)
	public Vuelo guardarVuelo(@RequestBody Vuelo vuelo) {
		return vueloRepositorio.save(vuelo); //Guardar un vuelo en la base de datos
	}
	
	//Este método sirve para buscar un vuelo por un id
	@GetMapping("/{id}")
	public ResponseEntity<Vuelo> obtenerVueloPorID(@PathVariable Long id){
		//Vamos a buscar el vuelo, si no existe, lanzamos una excepción.
		Vuelo vuelo = vueloRepositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el vuelo con el id: " + id));
		
		return ResponseEntity.ok(vuelo);
	}
	
	//Actualizar un vuelo
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Vuelo> actualizarVueloPorID(@PathVariable Long id, @RequestBody Vuelo vuelo){
		//Vamos a buscar el vuelo, si no existe, lanzamos una excepción.
		Vuelo vueloAct = vueloRepositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("No existe el vuelo con el id: " + id));
		
		//Actualizamos los datos
		vueloAct.setReferencia(vuelo.getReferencia());
		vueloAct.setFecha_salida(vuelo.getFecha_salida());
		vueloAct.setFecha_llegada(vuelo.getFecha_llegada());
		vueloAct.setCupo(vuelo.getCupo());
		vueloAct.setPeso_max(vuelo.getPeso_max());
		vueloAct.setMaletas_max(vuelo.getMaletas_max());
		
		//Guardamos el objeto en la base de datos
		Vuelo vueloActualizado = vueloRepositorio.save(vueloAct);
		
		//Retornamos el objeto que fue actualizado
		return ResponseEntity.ok(vueloActualizado);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarVuelo(@PathVariable Long id){
		vueloRepositorio.deleteById(id);
	}
}
