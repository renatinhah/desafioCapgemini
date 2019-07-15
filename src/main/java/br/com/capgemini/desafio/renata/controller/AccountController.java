package br.com.capgemini.desafio.renata.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Account save(@RequestBody @Valid Account account) {
    	return accountService.save(account);
    }
    
    @PostMapping("/balance")
	public Double seeBalance(@RequestBody @Valid BalanceDTO balanceDto){
		return accountService.seeBalance(balanceDto);
	}
    
    @PostMapping("/deposit")
	public Account deposit(@RequestBody @Valid UpdateBalanceDTO updateBalanceDTO){
		return accountService.deposit(updateBalanceDTO);
	}
    
    @PostMapping("/cashOut")
	public Account cashOut(@RequestBody @Valid UpdateBalanceDTO updateBalanceDTO){
		return accountService.cashOut(updateBalanceDTO);
	}
 
}
