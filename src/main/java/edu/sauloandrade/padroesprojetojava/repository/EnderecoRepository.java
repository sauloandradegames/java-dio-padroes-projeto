package edu.sauloandrade.padroesprojetojava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.sauloandrade.padroesprojetojava.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {}