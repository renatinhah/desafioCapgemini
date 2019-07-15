package br.com.capgemini.desafio.renata.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Account")
@Data 
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Account {

	@EmbeddedId
	private AccountId accountId;
	
	private Double balance;
	
	private String password;
	
	

}
