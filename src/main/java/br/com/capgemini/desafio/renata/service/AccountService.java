package br.com.capgemini.desafio.renata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.capgemini.desafio.renata.entity.Account;
import br.com.capgemini.desafio.renata.entity.AccountId;
import br.com.capgemini.desafio.renata.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

	public Account save(Account account) {
		return accountRepository.save(account);
	}
	
	public List<Account> list(){
		return accountRepository.findAll();
	}
	
	public Double seeBalance(AccountId accountId) {
//		Account account = accountRepository.findById(accountId);
//		Double balance = account.getBalance();
//		
//		return balance;
		return null;
	}
}
