package edu.sauloandrade.padroesprojetojava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.sauloandrade.padroesprojetojava.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {}