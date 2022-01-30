package dev.paie.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.ProfilRepository;

//@Controller
public class InsererProfil implements CommandLineRunner {
	
	private ProfilRepository profilRepository;
	
	public InsererProfil(ProfilRepository profilRepository) {
		super();
		this.profilRepository = profilRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		ProfilRemuneration profilRepository = new ProfilRemuneration();
		profilRepository.setCode("Alternant");
		this.profilRepository.save(profilRepository);
	}
}
