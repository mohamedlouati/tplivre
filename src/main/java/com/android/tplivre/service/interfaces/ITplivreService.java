package com.android.tplivre.service.interfaces;

import java.util.List;

import com.android.tplivre.entities.Livre;

public interface ITplivreService {

	List<Livre> findAll();

	Livre findOne(Long id);
	
	
	Livre findOneByTitre(String titre);

	Livre save(Livre livre);

	void delete(Long id);
	
}
