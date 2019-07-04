package resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.Disciplina;
import services.DisciplinaService;

@RestController
@RequestMapping(value="/disciplinas")
public class DisciplinaResource {
	
	@Autowired
	private DisciplinaService service;
	
	//BUSCAR POR ID
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<Disciplina> find(@PathVariable Integer id){
			Disciplina obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		}
	
}
