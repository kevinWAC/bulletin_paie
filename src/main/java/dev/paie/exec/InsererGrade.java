package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;

//@Controller
public class InsererGrade implements CommandLineRunner{
	
	private GradeRepository gradeRepository;
	
	public InsererGrade(GradeRepository gradeRepository) {
		super();
		this.gradeRepository = gradeRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Grade grade = new Grade();
		grade.setCode("GRADE_D");
		grade.setNbHeuresBase(new BigDecimal(152.00));
		grade.setTauxBase(new BigDecimal(41.00));
		this.gradeRepository.save(grade);
	}
	
}
