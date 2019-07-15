package br.com.capgemini.desafio.renata.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.capgemini.desafio.renata.entity.Account;
import br.com.capgemini.desafio.renata.entity.AccountId;
import br.com.capgemini.desafio.renata.repository.AccountRepository;

@Component
public class DbInitializer {

	@Autowired 
	private AccountRepository accountRepository;
	
	public void initialize() {
		AccountId accountId = AccountId.builder().
				agency(2525L).
				account(2020L).
				build();
		Account account = Account.builder().
				accountId(accountId).
				balance(5000D).
				password("1234").
				build();
		accountRepository.save(account);
	}
}
