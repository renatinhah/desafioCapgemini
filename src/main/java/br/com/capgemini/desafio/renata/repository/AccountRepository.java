package br.com.capgemini.desafio.renata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.capgemini.desafio.renata.entity.Account;
import br.com.capgemini.desafio.renata.entity.AccountId;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	Account findByAccountId(AccountId accountId);
}
