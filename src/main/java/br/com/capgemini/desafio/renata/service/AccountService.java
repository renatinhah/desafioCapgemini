package br.com.capgemini.desafio.renata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.capgemini.desafio.renata.dto.BalanceDTO;
import br.com.capgemini.desafio.renata.dto.UpdateBalanceDTO;
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
		Double balance = 0D;
		Account account = accountRepository.findByAccountId(accountId);
//		if(balanceDto.equals(account.getPassword())) {
//			balance = account.getBalance();
//		}
		return balance;
	}
	
	public Account deposit(UpdateBalanceDTO deposit) {
		AccountId accountId = AccountId.builder().
				agency(deposit.getAgency()).
				account(deposit.getAccount()).
				build();
		Account account = accountRepository.findByAccountId(accountId);
		Double newBalance = 0D;
		if(deposit.getValue() > 0) {
			newBalance = account.getBalance() + deposit.getValue();
		}
//		account.builder().balance(newBalance).build(); alguma coisa de acesso static
		account.setBalance(newBalance);
		Account accountUpdated = accountRepository.save(account);
		
		return accountUpdated;
	}
	
	public Account cashOut(UpdateBalanceDTO deposit) {
		AccountId accountId = AccountId.builder().
				agency(deposit.getAgency()).
				account(deposit.getAccount()).
				build();
		Account account = accountRepository.findByAccountId(accountId);
		Double newBalance = 0D;
		Double balance = account.getBalance();
		if(balance >= deposit.getValue()) {
			newBalance = balance - deposit.getValue();
		}
		account.setBalance(newBalance);
		Account accountUpdated = accountRepository.save(account);
		return accountUpdated;
	}
}
