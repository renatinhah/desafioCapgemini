package br.com.capgemini.desafio.renata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.capgemini.desafio.renata.dto.BalanceDTO;
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
	
	public Double seeBalance(BalanceDTO balanceDto) {
		AccountId accountId = AccountId.builder().
				agency(balanceDto.getAgency()).
				account(balanceDto.getAccount()).
				build();
		Account account = accountRepository.findByAccountId(accountId);
		Double balance = account.getBalance();
//		
		return balance;
	}
}
