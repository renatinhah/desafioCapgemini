package br.com.capgemini.desafio.renata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.capgemini.desafio.renata.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
