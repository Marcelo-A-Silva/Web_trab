package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Professor;
import repositories.ProfessorRepository;


@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repo;
	
	//BUSCAR POR ID
	public Professor find (Integer id) {
		Optional<Professor> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	//INSERIR
	public Professor insert (Professor obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	//ATUALIZA
	public Professor update(Professor obj) {
		Professor newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	
	//DELEATA
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	
	private void updateData(Professor newObj, Professor obj) {
		newObj.setNome	(obj.getNome());
		newObj.setSexo	(obj.getSexo());
		newObj.setIdade	(obj.getIdade());
		
	}
}
