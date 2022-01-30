package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import dev.paie.repository.RemunerationRepository;

@Controller
public class InsererRemuneration implements CommandLineRunner {
	
	private RemunerationRepository remunerationRepository;
	
	public InsererRemuneration(RemunerationRepository remunerationRepository) {
		super();
		this.remunerationRepository = remunerationRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
	
	
		
	}
}
