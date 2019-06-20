package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Disciplina;
import repositories.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository repo;
	
	//BUSCAR POR ID
	public Disciplina find (Integer id) {
		Optional<Disciplina> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	//INSERIR
	public Disciplina insert (Disciplina obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	//ATUALIZA
	public Disciplina update(Disciplina obj) {
		Disciplina newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	
	//DELEATA
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	private void updateData(Disciplina newObj, Disciplina obj) {
		newObj.setNome	(obj.getNome());
	}
	
	
}
