package br.com.capgemini.desafio.renata.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.capgemini.desafio.renata.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long>{

}
