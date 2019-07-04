package services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Aluno;
import domain.Disciplina;
import domain.Professor;
import repositories.AlunoRepository;
import repositories.DisciplinaRepository;
import repositories.ProfessorRepository;

@Service
public class DbService {

	@Autowired
	private DisciplinaRepository disRep;

	@Autowired
	private AlunoRepository aluRep;
	
	@Autowired
	private ProfessorRepository proRep;
	
	public void inicializaBancoDeDados() throws ParseException {
		
		
		Disciplina dis1 = new Disciplina(null, "Portugues");
		Disciplina dis2 = new Disciplina(null, "Matematica");
		
		Aluno a1 = new Aluno(null, "Aluno1", 5.5);
		
		Professor p1= new Professor(null, "Paulo", 40, "M");
		
		
		disRep.saveAll(Arrays.asList(dis1, dis2));
		aluRep.saveAll(Arrays.asList(a1));
		proRep.saveAll(Arrays.asList(p1));
	}
	
	
}
