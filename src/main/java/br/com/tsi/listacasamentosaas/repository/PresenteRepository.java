package br.com.tsi.listacasamentosaas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tsi.model.Presente;

public interface PresenteRepository extends MongoRepository<Presente,String> {

	List<Presente> findByIdUsuario(String idUsuario);
	List<Presente> findById(String id);
}

