package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Aluno;
import repositories.AlunoRepository;

public class AlunoService {

	@Autowired
	private AlunoRepository repo;
	
	
	//BUSCAR POR ID
		public Aluno find (Integer id) {
			Optional<Aluno> obj = repo.findById(id);
			return obj.orElse(null);
		}
		
		//INSERIR
		public Aluno insert (Aluno obj) {
			obj.setId(null);
			return repo.save(obj);
		}
		
		//ATUALIZA
		public Aluno update(Aluno obj) {
			Aluno newObj = find(obj.getId());
			updateData(newObj, obj);
			return repo.save(newObj);
		}

		
		//DELEATA
		public void delete(Integer id) {
			find(id);
			repo.deleteById(id);
		}
		
		private void updateData(Aluno newObj, Aluno obj) {
			newObj.setNome	(obj.getNome());
			newObj.setNota	(obj.getNota());
		}
		
	
}
