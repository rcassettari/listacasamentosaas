package br.com.tsi.listacasamentosaas.controller;

import java.util.List;

import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tsi.model.Presente;
import br.com.tsi.listacasamentosaas.repository.PresenteRepository;

@RestController
@CrossOrigin
@RequestMapping(value="/presente")
public class PresenteController {

	private PresenteRepository presenteRepository;
	
	public PresenteController(PresenteRepository presenteRepository) {
		this.presenteRepository = presenteRepository;
	}
	
	@GetMapping( value = "/findall/" )
	public List<Presente> findAll() {
		return presenteRepository.findAll();
	}
	
	@PostMapping( value = "/save/" )
	public void save(@RequestBody Presente presente) {
		presenteRepository.save(presente);
	}
	
	@GetMapping(value = "/findbyusuario/{idUsuario}")
	private List<Presente> findByUsuario(@PathVariable(value="idUsuario") String q)
	{
		return presenteRepository.findByIdUsuario(q);
	}
	
	@DeleteMapping( value = "/delete/" )
	public void delete(@RequestBody Presente presente) {
		if( presente != null && presente.getId() != null && presente.getId().trim() != "" )
		{
			List<Presente> searchedGifts = presenteRepository.findById(presente.getId());
						
			if(searchedGifts != null && searchedGifts.size() > 0)
				presenteRepository.delete(presente);
		}
	}
	
	@DeleteMapping( value = "/delete/{idPresente}" )
	public void delete(@PathVariable(value="idPresente") String idPresente ) {
		if( idPresente != null && idPresente.trim() != "" )
		{
			List<Presente> searchedGifts = presenteRepository.findById(idPresente);
						
			if(searchedGifts != null && searchedGifts.size() > 0)
			{
				Presente toDelete = new Presente();
				toDelete.setId(idPresente);
				
				presenteRepository.delete(toDelete);
			}
		}
	}
	
	@PostMapping( value = "/update/" )
	public void update(@RequestBody Presente presente) {
		
		if( presente != null && presente.getId() != null && presente.getId().trim() != "" )
		{
			List<Presente> searchedGifts = presenteRepository.findById(presente.getId());
						
			if(searchedGifts != null && searchedGifts.size() > 0)
				presenteRepository.save(presente);
		}
	}

}


