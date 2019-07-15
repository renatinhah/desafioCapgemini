package br.com.capgemini.desafio.renata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.capgemini.desafio.renata.entity.Account;
import br.com.capgemini.desafio.renata.entity.AccountId;
import br.com.capgemini.desafio.renata.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountRepository repository;
	
	@GetMapping
	public List<Account> list(){
		return repository.findAll();
	}
	
    @PostMapping
    public Account save(@RequestBody @Valid Account account) {
    	return repository.save(account);
    }
}
