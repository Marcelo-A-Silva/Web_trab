package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
	@Transactional(readOnly=true)
	List<Professor> findByIdOrderById(Integer Id);

}