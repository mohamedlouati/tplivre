package com.android.tplivre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.android.tplivre.entities.Livre;
import com.android.tplivre.service.interfaces.ITplivreService;


@RestController
public class LivreController {

	@Autowired
	ITplivreService livreService;

	@RequestMapping(value = "livres", method = RequestMethod.GET)
	public List<Livre> findAll() {
		return livreService.findAll();
	}
	/*@RequestMapping(value = "livres/{titre}", method = RequestMethod.GET)
	public Livre findOneByTitre(@PathVariable("titre") String titre) {
		return livreService.findOneByTitre(titre);
	}*/
	@RequestMapping(value = "livres/{id}", method = RequestMethod.GET)
	public Livre findOne(@PathVariable("id") Long id) {
		return livreService.findOne(id);
	}
	@RequestMapping(value = "livres", method = RequestMethod.POST)
	public Livre saveLivre(@RequestBody Livre livre) {
		return livreService.save(livre);
	}
	@RequestMapping(value = "livres/{id}", method = RequestMethod.DELETE)
	public void deleteLivre(@PathVariable("id") Long id) {
		livreService.delete(id);
	}
	@RequestMapping(value = "livres/{id}", method = RequestMethod.PUT)
	public Livre update(@PathVariable("id") Long id,@RequestBody Livre livre) {
		Livre currentLivre = livreService.findOne(id);
		currentLivre.setTitre(livre.getTitre());
		return livreService.save(currentLivre);
	}
	
}
