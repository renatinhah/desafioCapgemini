package br.com.capgemini.desafio.renata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.capgemini.desafio.renata.dto.BalanceDTO;
import br.com.capgemini.desafio.renata.dto.UpdateBalanceDTO;
import br.com.capgemini.desafio.renata.entity.Account;
import br.com.capgemini.desafio.renata.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public List<Account> list(){
		return accountService.list();
	}
	
    @PostMapping
    public Account save(@RequestBody @Valid Account account) {
    	return accountService.save(account);
    }
    
    @PostMapping("/balance")
	public Double seeBalance(@RequestBody @Valid BalanceDTO balanceDto){
		return accountService.seeBalance(balanceDto);
	}
    
    @PostMapping("/deposit")
	public Account deposit(@RequestBody @Valid UpdateBalanceDTO deposit){
		return accountService.deposit(deposit);
	}
    
    @PostMapping("/cashOut")
	public Account cashOut(@RequestBody @Valid UpdateBalanceDTO deposit){
		return accountService.cashOut(deposit);
	}
    
    
    
    
//    @GetMapping("/balance/{accountId}")
//	public Double seeBalance(@PathVariable AccountId accountId){
//		return accountService.seeBalance(accountId);
//	}
 
}
