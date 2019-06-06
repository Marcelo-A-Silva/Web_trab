package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository rep;
	
	//BUSCAR POR ID
	public Professor find (Integer id) {
		Optional<Professor> obj = rep.findById(id);
		return obj.orElse(null);
	}
	
	//INSERIR
	public Professor insert (Professor obj) {
		obj.setId(null);
		return rep.save(obj);
	}
}
