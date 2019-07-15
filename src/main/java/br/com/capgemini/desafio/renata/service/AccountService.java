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
		
		if(balanceDto.getPassword().equals(account.getPassword())) {
			balance = account.getBalance();
		}
		return balance;
	}
	
	public Account deposit(UpdateBalanceDTO updateBalanceDTO) {
		AccountId accountId = AccountId.builder().
				agency(updateBalanceDTO.getAgency()).
				account(updateBalanceDTO.getAccount()).
				build();
		Account account = accountRepository.findByAccountId(accountId);
		Double newBalance = 0D;
		if(updateBalanceDTO.getValue() > 0) {
			newBalance = account.getBalance() + updateBalanceDTO.getValue();
		}
		account.setBalance(newBalance);
		Account accountUpdated = accountRepository.save(account);
		
		return accountUpdated;
	}
	
	public Account cashOut(UpdateBalanceDTO updateBalanceDTO) {
		AccountId accountId = AccountId.builder().
				agency(updateBalanceDTO.getAgency()).
				account(updateBalanceDTO.getAccount()).
				build();
		Account account = accountRepository.findByAccountId(accountId);
		if(updateBalanceDTO.getPassword().equals(account.getPassword())) {
			Double newBalance = 0D;
			Double balance = account.getBalance();
			if(balance >= updateBalanceDTO.getValue()) {
				newBalance = balance - updateBalanceDTO.getValue();
				account.setBalance(newBalance);
			}
		}
		Account accountUpdated = accountRepository.save(account);
		return accountUpdated;
	}
}
