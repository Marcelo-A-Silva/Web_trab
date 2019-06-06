package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	@Transactional(readOnly=true)
	List<Aluno> findDistinctByIdContainingOrderById(Integer Id );
	
}