package com.android.tplivre.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.tplivre.entities.Livre;
import com.android.tplivre.repositories.LivreRepository;
import com.android.tplivre.service.interfaces.ITplivreService;


@Service
public class LivreService implements ITplivreService{


	@Autowired
	LivreRepository livreRepository;
	
	@Override
	public List<Livre> findAll() {
		return livreRepository.findAll();
	}

	@Override
	public Livre findOne(Long id) {
		return livreRepository.findOne(id);
	}



	@Override
	public Livre save(Livre livre) {
		return livreRepository.save(livre);
		
	}
	@Override
	public void delete(Long id) {
		livreRepository.delete(id);
		
	}

	@Override
	public Livre findOneByTitre(String titre) {
		return livreRepository.findOneByTitre(titre);
	}

}
