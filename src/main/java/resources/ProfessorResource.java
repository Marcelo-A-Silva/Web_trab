package resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.Professor;
import services.ProfessorService;

@RestController
@RequestMapping(value="/professores")
public class ProfessorResource {
	
	@Autowired
	private ProfessorService service;
	
	//BUSCAR POR ID
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Professor> find(@PathVariable Integer id){
		Professor obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
