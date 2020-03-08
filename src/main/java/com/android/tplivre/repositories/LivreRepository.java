package com.android.tplivre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.android.tplivre.entities.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
	Livre findOneByTitre(String titre);

}
