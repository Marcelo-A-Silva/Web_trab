package resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.Aluno;
import services.AlunoService;

@RestController
@RequestMapping(value="/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	//BUSCAR POR ID
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Aluno> find(@PathVariable Integer id){
		Aluno obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
